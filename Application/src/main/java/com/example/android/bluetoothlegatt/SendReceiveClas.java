package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class SendReceiveClas extends Activity {

//    private BluetoothGattCharacteristic bluetoothGattCharacteristicHM_10;
//    private BluetoothLeService mBluetoothLeService;

//    //getter
//    public BluetoothGattCharacteristic getBTGattCharacteristic(){
//        return bluetoothGattCharacteristicHM_10;
//    }
//
//    //setter
//    public void setBTGattCharacteristic(BluetoothGattCharacteristic BTGattCHar) {
//        this.bluetoothGattCharacteristicHM_10 = BTGattCHar;
//    }
//    //getter
//    public BluetoothLeService getmBTLeService(){
//        return mBluetoothLeService;
//    }
//
//    // setter
//    public void setBTLeService(BluetoothLeService BTLeServ) {
//        this.mBluetoothLeService = BTLeServ;
//    }


    DeviceControlActivity DCActivity = new DeviceControlActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendlayout);
    }

    public void onClickWrite (View v) {
        EditText mCommand = (EditText)findViewById(R.id.sendvalue);
                String val=mCommand.getText().toString();
                DCActivity.bluetoothGattCharacteristicHM_10.setValue("$" +val+"#"+"\n" );
                DCActivity.mBluetoothLeService.writeCharacteristic(DCActivity.bluetoothGattCharacteristicHM_10);
                DCActivity.mBluetoothLeService.setCharacteristicNotification(DCActivity.bluetoothGattCharacteristicHM_10, true);

//        DCActivity.setBTGattCharacteristic.setValue("$" +val+"#"+"\n" );
//        DCActivity.setBTLeService.writeCharacteristic(DCActivity.BTGattCharacteristic);
//        DCActivity.setBTLeService.setCharacteristicNotification(DCActivity.BTGattCharacteristic, true);

    };


//    public void onClickRead(View v) {
//
//    }
}