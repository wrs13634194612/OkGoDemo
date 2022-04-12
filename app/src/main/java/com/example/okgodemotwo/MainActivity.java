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


        Button btn_room_state = findViewById(R.id.btn_room_state);
        Button btn_controller_red = findViewById(R.id.btn_controller_red);
        Button btn_search_device = findViewById(R.id.btn_search_device);
        Button btn_update = findViewById(R.id.btn_update);
        Button btn_timer_state = findViewById(R.id.btn_timer_state);
        Button btn_search_device_num = findViewById(R.id.btn_search_device_num);



        btn_room_state.setBackgroundColor(Color.RED);
        btn_controller_red.setBackgroundColor(Color.GRAY);
        btn_search_device.setBackgroundColor(Color.GREEN);
        btn_update.setBackgroundColor(Color.BLUE);
        btn_timer_state.setBackgroundColor(Color.rgb(0,255,255));
        btn_search_device_num.setBackgroundColor(Color.rgb(66,8,0));


        /**
         RoomStateActivity  首页房间全开全关
         ControllerRedActivity		遥控器-添加遥控-选择红外设备接口
         SearchDeviceActivity	查找模式-详情-内部设备
         UpdateActivity	更新模式
         TimerStateActivity		获取定时执行状态
         SearchDeviceNumActivity		查询设备数量
         * */

        btn_room_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RoomStateActivity.class);
                startActivity(intent);
            }
        });

        btn_controller_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ControllerRedActivity.class);
                startActivity(intent);
            }
        });

        btn_search_device.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchDeviceActivity.class);
                startActivity(intent);
            }
        });

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UpdateActivity.class);
                startActivity(intent);
            }
        });


        btn_timer_state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TimerStateActivity.class);
                startActivity(intent);
            }
        });

        btn_search_device_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchDeviceNumActivity.class);
                startActivity(intent);
            }
        });
    }
}