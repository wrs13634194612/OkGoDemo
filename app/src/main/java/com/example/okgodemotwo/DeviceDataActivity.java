package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import java.util.List;


public class DeviceDataActivity extends AppCompatActivity {
    String url = "https://www.mindordz.com:8181/mindor/dc/loadDevices";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp113988")
                .params("type", "")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Gson gson = new Gson();
                        DeviceDataBean mDeviceDataBean = gson.fromJson(response.body(), DeviceDataBean.class);
                        List<DeviceDataBean.DataBean> list = mDeviceDataBean.getData();
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n"+list);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }


}