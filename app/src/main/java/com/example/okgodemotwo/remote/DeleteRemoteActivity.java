package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class DeleteRemoteActivity extends AppCompatActivity {
    String url = "http://tt.mindordz.com:6361/api/hac/deleteRc";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_remote);
        getData();
    }


    private void getData() {
        OkGo.<String>delete(url)
                .params("userId", "minApp108881")
                .params("modeId", "3770299a311655706323558")
                .params("id", "1")
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