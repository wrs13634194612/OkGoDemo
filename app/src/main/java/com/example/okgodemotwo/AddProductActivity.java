package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class AddProductActivity extends AppCompatActivity {
    // String url2 = "http://www.mindordz.com:8381/mindor/dc/loadProduct";
    // String url = "https://www.mindordz.com:8181/mindor/shc/getDeviceShares";

    String url = "https://www.mindordz.com:8181/mindor/dc/loadProduct";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp113988")
                .params("productId", "zcz002")
                .params("equipmentId", "zcz002103910")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Gson gson = new Gson();
                        AddProductBean mAddProductBean = gson.fromJson(response.body(), AddProductBean.class);
                        String name = mAddProductBean.getData().getEquipmentNote();
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n" + name);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }


}