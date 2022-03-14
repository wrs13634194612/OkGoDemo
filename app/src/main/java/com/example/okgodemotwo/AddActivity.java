package com.example.okgodemotwo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.OkGo;



public class AddActivity extends AppCompatActivity {
    String url = "http://www.mindordz.com:8381/mindor/dc/loadProduct";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp108881")
                .params("productId", "swt002")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        AddBean mAddBean = JSONObject.parseObject(response.body(), AddBean.class);
                        Log.e("TAG", "onSuccess:" + mAddBean);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }
}