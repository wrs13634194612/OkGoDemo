package com.example.okgodemotwo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerActivity extends AppCompatActivity {
    private String getUrl = "https://www.mindordz.com:8181/mindor/dc/getEquipmentVersion";
    private String updateUrl = "https://www.mindordz.com:8181/mindor/dc/updateEquipmentVersion";
    private String GATE_HOST_TES2T = "http://tt.mindordz.com:8381/mindor/";
    private String GATE_HOST_TEST = "https://www.mindordz.com:8181/mindor/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
        Button btn_today = findViewById(R.id.btn_today);
        Button btn_week = findViewById(R.id.btn_week);
        btn_today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateTodayData();
            }
        });
        btn_week.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     updatePasswordData();
            }
        });
    }

 /*   private void getTodayData() {
        OkGo.<String>get(GATE_HOST_TEST + "com/appPhoneLogin")
                .params("phone", "13634194612")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n");
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }*/


    private void updateTodayData() {
        UpdateDeviceBean mUpdateDeviceBean = new UpdateDeviceBean();
        mUpdateDeviceBean.setPhone("13634194612");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateDeviceBean);
        OkGo.<String>post(GATE_HOST_TEST + "com/appPhoneLogin")
                .upJson(jsonString)
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "onSuccess:" + response.body());
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }

    private void updatePasswordData() {
        UpdateDeviceBean2 mUpdateDeviceBean2 = new UpdateDeviceBean2();
        mUpdateDeviceBean2.setPhone("13634194612");
        mUpdateDeviceBean2.setNewPassword("987654321");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateDeviceBean2);
        OkGo.<String>post(GATE_HOST_TEST + "com/appForgotPassword")
                .upJson(jsonString)
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "onSuccess:" + response.body());
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }

}