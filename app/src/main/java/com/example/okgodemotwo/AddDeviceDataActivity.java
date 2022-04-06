package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class AddDeviceDataActivity extends AppCompatActivity {

    String url = "https://www.mindordz.com:8181/mindor/dc/operateDevices";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {
        SendDeviceBean mSendDeviceBean = new SendDeviceBean();
        mSendDeviceBean.setEquipmentId("zcz002103910");
        mSendDeviceBean.setUserId("minApp113988");
        mSendDeviceBean.setProductId("zcz002");
        mSendDeviceBean.setEquipmentNote("一氧化碳(co)");
        mSendDeviceBean.setEquipmentRoom("客厅");
        mSendDeviceBean.setEquipmentLabel("客厅,主卧,次卧,卧室,厨房,阳台,洗手间");
        mSendDeviceBean.setButNames("按键一");
        mSendDeviceBean.setEquipmentType("WIFI");

        Gson gson = new Gson();
        String jsonString = gson.toJson(mSendDeviceBean);
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