package com.sie.thi_lv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtten, txttacgia;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtten = (TextView) findViewById(R.id.txtten);
        txttacgia = (TextView) findViewById(R.id.txttacgia);
        img= findViewById(R.id.img);
        Intent intent= getIntent();
        if (intent!=null){
            img.setImageResource(R.drawable.ic_code_black_24dp);
            txtten.setText(intent.getStringExtra("TEN"));
            txttacgia.setText(intent.getStringExtra("DIACHI"));

        }
    }
}

