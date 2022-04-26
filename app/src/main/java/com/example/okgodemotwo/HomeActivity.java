package com.example.okgodemotwo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button btn_device_share = findViewById(R.id.btn_device_share);
        Button btn_device_all = findViewById(R.id.btn_device_all);

        Button btn_device_detail = findViewById(R.id.btn_device_detail);
        Button btn_device_add = findViewById(R.id.btn_device_add);
        Button btn_device_delete = findViewById(R.id.btn_device_delete);

        Button btn_add_all = findViewById(R.id.btn_add_all);




        btn_device_share.setBackgroundColor(Color.RED);
        btn_device_all.setBackgroundColor(Color.GRAY);

        btn_device_detail.setBackgroundColor(Color.BLUE);
        btn_device_add.setBackgroundColor(Color.MAGENTA);
        btn_device_delete.setBackgroundColor(Color.GREEN);


        btn_add_all.setBackgroundColor(Color.RED);


        btn_device_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DeviceDataActivity.class);
                startActivity(intent);
            }
        });

        btn_device_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DeviceShareDataActivity.class);
                startActivity(intent);
            }
        });


        btn_device_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AddProductActivity.class);
                startActivity(intent);
            }
        });

        btn_device_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AddDeviceDataActivity.class);
                startActivity(intent);
            }
        });

        btn_device_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DeleteProductActivity.class);
                startActivity(intent);
            }
        });
        btn_add_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AddUpdateActivity.class);
                startActivity(intent);
            }
        });

    }
}