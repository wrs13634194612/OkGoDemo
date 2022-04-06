package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class DeleteProductActivity extends AppCompatActivity {
    String url = "https://www.mindordz.com:8181/mindor/dc/deleteDevices";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {
        OkGo.<String>delete(url)
                .params("equipmentId", "zcz002103910")
                .params("userId", "minApp113988")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        DeleteBean mDeleteBean = JSONObject.parseObject(response.body(), DeleteBean.class);
                        Log.e("TAG", "onSuccess:" + response.body() + "\n" + mDeleteBean.getMessage());
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }
}