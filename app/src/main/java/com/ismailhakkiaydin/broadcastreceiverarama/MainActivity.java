package com.ismailhakkiaydin.broadcastreceiverarama;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends RuntimeIzinlerActivity {

    private static final int ARAMA_IZNI= 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] istenilenIzinler={Manifest.permission.READ_PHONE_STATE};
        MainActivity.super.izinIste(istenilenIzinler, ARAMA_IZNI);

    }

    @Override
    public void izinVerildi(int requestCode) {

        if(requestCode==ARAMA_IZNI)
            Toast.makeText(this, "GEREKEN IZIN VERILDI", Toast.LENGTH_LONG).show();
    }


}