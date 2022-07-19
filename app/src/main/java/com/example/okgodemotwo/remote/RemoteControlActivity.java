package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

public class RemoteControlActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:6361/api/hac/rcControl";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_control);
        getData();
    }

    private void getData() {
        RcControlBean mRcControlBean = new RcControlBean();
        mRcControlBean.setRcId(16);
        mRcControlBean.setDeviceId(5);
        mRcControlBean.setModeId("6a56dfd96d1657882000851");
        mRcControlBean.setModeHead("013D,12");
        mRcControlBean.setKeyName("开");
        mRcControlBean.setKeyIndex(0);
        Gson gson = new Gson();
        String jsonString = gson.toJson(mRcControlBean);
        OkGo.<String>post(url)
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
/**
 {
 "code":200,
 "data":"05,00,00,01,00,01",
 "message":"操作成功"
 }
* */
