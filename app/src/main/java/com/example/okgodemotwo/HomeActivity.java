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


        btn_device_share.setBackgroundColor(Color.RED);
        btn_device_all.setBackgroundColor(Color.GRAY);



        /**
         RoomStateActivity  首页房间全开全关
         ControllerRedActivity		遥控器-添加遥控-选择红外设备接口
         SearchDeviceActivity	查找模式-详情-内部设备
         UpdateActivity	更新模式
         TimerStateActivity		获取定时执行状态
         SearchDeviceNumActivity		查询设备数量
         * */


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

    }
}