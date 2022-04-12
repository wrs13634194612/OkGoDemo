package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class RoomStateActivity extends AppCompatActivity {
    String url = "https://www.mindordz.com:8181/mindor/dc/controlRoomSwitch";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }


    /**
     * 新参数
     * userId 字符串
     * room  字符串
     * state 整形
     */

    private void getData() {
        OkGo.<String>put(url)
                .params("userId", "13")
                .params("room", "zcz002103910")
                .params("state", "zcz002103910")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        DeleteBean mDeleteBean = JSONObject.parseObject(response.body(), DeleteBean.class);
                        Log.e("TAG", "onSuccess:" + mDeleteBean);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }
}