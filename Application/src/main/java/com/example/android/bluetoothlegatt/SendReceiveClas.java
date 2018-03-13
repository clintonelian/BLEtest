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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_control);
    }

    public void onClickWrite (View v) {
        EditText mCommand = (EditText)findViewById(R.id.sendvalue);
                String val=mCommand.getText().toString();
//                bluetoothGattCharacteristicHM_10.setValue("$" +val+"#"+"\n" );
//                mBluetoothLeService.writeCharacteristic(bluetoothGattCharacteristicHM_10);
//                mBluetoothLeService.setCharacteristicNotification(bluetoothGattCharacteristicHM_10, true);

        DeviceControlActivity.setBTGattCharacteristic.setValue("$" +val+"#"+"\n" );
        DeviceControlActivity.setBTLeService.writeCharacteristic(BTGattCharacteristic);
        DeviceControlActivity.setBTLeService.setCharacteristicNotification(BTGattCharacteristic, true);

    };



    getBTGattCharacteristic();

//    public void onClickRead(View v) {
//
//    }
}