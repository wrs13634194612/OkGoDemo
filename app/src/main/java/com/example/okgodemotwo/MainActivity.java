package com.example.okgodemotwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_device_data = findViewById(R.id.btn_device_data);
        Button btn_delete_device_data = findViewById(R.id.btn_delete_device_data);
        Button btn_add_produce_data = findViewById(R.id.btn_add_produce_data);
        Button btn_add_device_data = findViewById(R.id.btn_add_device_data);

        btn_device_data.setBackgroundColor(Color.RED);
        btn_delete_device_data.setBackgroundColor(Color.GRAY);
        btn_add_produce_data.setBackgroundColor(Color.GREEN);
        btn_add_device_data.setBackgroundColor(Color.BLUE);

        btn_device_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeviceDataActivity.class);
                startActivity(intent);
            }
        });

        btn_delete_device_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeleteProductActivity.class);
                startActivity(intent);
            }
        });

        btn_add_produce_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddProductActivity.class);
                startActivity(intent);
            }
        });

        btn_add_device_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddDeviceDataActivity.class);
                startActivity(intent);
            }
        });

    }
}