package com.example.okgodemotwo;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ElectricityGetActivity extends AppCompatActivity {

    private String url = "http://tt.mindordz.com:8381/mindor/ft/getByAppliance";
    private RecyclerView gv_devices;
    private TextView tv_number;
    private RoomAdapter mAdapter;

    /**
     获取家电保护数据
     接口: http://www.mindordz.com:8381/mindor/ft/getByAppliance
     请求方式: GET
     测试(KEY-VALUE格式):
     {
     equipmentId:"zcz001100112"
     }

     接口新
     * */


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        tv_number = findViewById(R.id.tv_number);

        gv_devices = findViewById(R.id.rv_online_devices);

        getData();
    }


    private void getData() {
        OkGo.<String>get(url)
                .params("equipmentId", "zcz002105405")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        // ShareReceiveBean mShareReceiveBean = JSONObject.parseObject(response.body(), ShareReceiveBean.class);
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body());

                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }

    /**  zcz002105405
     {
     "code":200,
     "data":{
     "equipmentId":"3c6105d076c1",
     "delay":10,
     "standbyPower":15,
     "status":1
     },
     "message":"查询成功"
     }
     * */

}
