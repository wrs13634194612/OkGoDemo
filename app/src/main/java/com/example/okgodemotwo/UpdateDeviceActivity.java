package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class UpdateDeviceActivity extends AppCompatActivity {
    String url = "http://www.mindordz.com:8381/mindor/dc/operateDevices";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    private void getData() {
        UpdateSendBean mUpdateSendBean = new UpdateSendBean();
        mUpdateSendBean.setEquipmentId("zcz00110011");
        mUpdateSendBean.setUserId("minApp113988");
        mUpdateSendBean.setProductId("zcz001");
        mUpdateSendBean.setEquipmentName("开关3");
        mUpdateSendBean.setEquipmentButName("按键13");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateSendBean);
        OkGo.<String>post(url)
                .upJson(jsonString)
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        UpdateBean mUpdateBean = JSONObject.parseObject(response.body(), UpdateBean.class);
                        Log.e("TAG", "onSuccess:" + mUpdateBean);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }
}