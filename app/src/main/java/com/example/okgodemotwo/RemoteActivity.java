package com.example.okgodemotwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.okgodemotwo.remote.ScheduleActivity;
import com.example.okgodemotwo.remote.DeleteTimeActivity;
import com.example.okgodemotwo.remote.CountdownActivity;
import com.example.okgodemotwo.remote.BrandMatchActivity;
import com.example.okgodemotwo.remote.RemoteConfirmActivity;
import com.example.okgodemotwo.remote.AllRemotesActivity;
import com.example.okgodemotwo.remote.DeleteRemoteActivity;
import com.example.okgodemotwo.remote.SmartMatchActivity;
import com.example.okgodemotwo.remote.RemoteControlActivity;


public class RemoteActivity extends AppCompatActivity {
    private Button btn_schedule, btn_delete_time, btn_countdown,
            btn_brand_match, btn_remote_confirm, btn_all_remotes,
            btn_delete_remote, btn_smart_match, btn_remote_control;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote);

        btn_schedule = findViewById(R.id.btn_schedule);
        btn_delete_time = findViewById(R.id.btn_delete_time);
        btn_countdown = findViewById(R.id.btn_countdown);
        btn_brand_match = findViewById(R.id.btn_brand_match);
        btn_remote_confirm = findViewById(R.id.btn_remote_confirm);
        btn_all_remotes = findViewById(R.id.btn_all_remotes);
        btn_delete_remote = findViewById(R.id.btn_delete_remote);
        btn_smart_match = findViewById(R.id.btn_smart_match);
        btn_remote_control = findViewById(R.id.btn_remote_control);


        btn_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, ScheduleActivity.class);
                startActivity(intent);
            }
        });

        btn_delete_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, DeleteTimeActivity.class);
                startActivity(intent);
            }
        });
        btn_countdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, CountdownActivity.class);
                startActivity(intent);
            }
        });
        btn_brand_match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, BrandMatchActivity.class);
                startActivity(intent);
            }
        });
        btn_remote_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, RemoteConfirmActivity.class);
                startActivity(intent);
            }
        });
        btn_all_remotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, AllRemotesActivity.class);
                startActivity(intent);
            }
        });
        btn_delete_remote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, DeleteRemoteActivity.class);
                startActivity(intent);
            }
        });
        btn_smart_match.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, SmartMatchActivity.class);
                startActivity(intent);
            }
        });
        btn_remote_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RemoteActivity.this, RemoteControlActivity.class);
                startActivity(intent);
            }
        });


    }
}
