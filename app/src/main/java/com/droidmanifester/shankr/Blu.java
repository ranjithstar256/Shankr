package com.droidmanifester.shankr;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Blu extends AppCompatActivity {
    Switch blu;
    ToggleButton wifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blu);
        blu= (Switch) findViewById(R.id.switch1);
        wifi= (ToggleButton) findViewById(R.id.toggleButton);
        blu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if(isChecked){
                    mBluetoothAdapter.enable();
                }else {
                    mBluetoothAdapter.disable();
                }
            }
        });
        wifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                WifiManager wifi =(WifiManager)getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                if(isChecked){
                    wifi.setWifiEnabled(true);
                }
                else {
                    wifi.setWifiEnabled(false);
                }
            }
        });
    }
}
