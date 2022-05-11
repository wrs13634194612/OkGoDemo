package com.example.okgodemotwo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PushAllActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_all);

        Button btn_push_get = findViewById(R.id.btn_push_get);
        Button btn_push_single_read = findViewById(R.id.btn_push_single_read);
        Button btn_push_all_read = findViewById(R.id.btn_push_all_read);
        Button btn_push_single_delete = findViewById(R.id.btn_push_single_delete);
        Button btn_push_all_delete = findViewById(R.id.btn_push_all_delete);
        Button btn_push_send_msg = findViewById(R.id.btn_push_send_msg);

        Button btn_push_json = findViewById(R.id.btn_push_json);


        btn_push_get.setBackgroundColor(Color.RED);
        btn_push_single_read.setBackgroundColor(Color.GRAY);
        btn_push_all_read.setBackgroundColor(Color.GREEN);
        btn_push_single_delete.setBackgroundColor(Color.BLUE);
        btn_push_all_delete.setBackgroundColor(Color.rgb(66, 8, 0));
        btn_push_json.setBackgroundColor(Color.MAGENTA);


        btn_push_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushGetActivity.class);
                startActivity(intent);
            }
        });
        btn_push_single_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushSingleReadActivity.class);
                startActivity(intent);
            }
        });
        btn_push_all_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushAllReadActivity.class);
                startActivity(intent);
            }
        });
        btn_push_single_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushSingleDeleteActivity.class);
                startActivity(intent);
            }
        });
        btn_push_all_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushAllDeleteActivity.class);
                startActivity(intent);
            }
        });

        btn_push_send_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushSendMsgActivity.class);
                startActivity(intent);
            }
        });

        btn_push_json.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PushAllActivity.this, PushJsonActivity.class);
                startActivity(intent);
            }
        });

    }
}
