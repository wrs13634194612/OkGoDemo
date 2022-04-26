package com.example.okgodemotwo;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AddUpdateActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:8381/mindor/dc/loadProduct";
    private String url2 = "http://tt.mindordz.com:8381/mindor/dc/operateDevices";

    private String labelString;

    private List<FlowDevice> flowList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_update);
        Button btn_update_detail = findViewById(R.id.btn_update_detail);
        Button btn_update_add = findViewById(R.id.btn_update_add);

        flowList = new ArrayList<>();

        btn_update_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();

            }
        });

        btn_update_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAddData();

            }
        });

    }

    private void getAddData() {
        SendDeviceBean mSendDeviceBean = new SendDeviceBean();
        mSendDeviceBean.setEquipmentId("zcz002105405");
        mSendDeviceBean.setUserId("minApp113043");
        mSendDeviceBean.setProductId("zcz002");
        mSendDeviceBean.setEquipmentNote("一氧化碳4(co)");
        mSendDeviceBean.setEquipmentRoom("洗手间");
        mSendDeviceBean.setEquipmentLabel(labelString);
        mSendDeviceBean.setButNames("按键一");
        mSendDeviceBean.setEquipmentType("WIFI");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mSendDeviceBean);
        OkGo.<String>post(url2)
                .upJson(jsonString)
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "onSuccess:" + response.body());
                        Message msg = new Message();
                        msg.what = 402;
                        msg.obj = response.body();
                        mHandler.sendMessage(msg);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp113043")
                .params("equipmentId", "zcz002105405")
                .params("productId", "zcz002")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "onError:" + response.body());
                        Message msg = new Message();
                        msg.what = 401;
                        msg.obj = response.body();
                        mHandler.sendMessage(msg);
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }




    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 401) {
                String post = (String) message.obj;
                Gson gson = new Gson();
                AddProductBean mDeviceDataBean = gson.fromJson(post, AddProductBean.class);
                labelString = mDeviceDataBean.getData().getEquipmentLabel();

                List<String> list = Arrays.asList("labelString".split(","));

                for (int i=0;i<list.size();i++){
                    flowList.add(new FlowDevice(list.get(i)));
                }

                Log.e("TAG", "onSuccess:" +flowList);


                /**
                 val labels = detailDevices[0].equipmentLabel.split(",")
                 labels.forEachIndexed { index, s ->
                 flows.add(Flow(s))
                 val spec = detailDevices[0].specificEquipmentLabel
                 if (s == spec) {
                 checkIndex = index
                 }
                 }
                * */




            } else if (message.what == 402) {
                String post = (String) message.obj;
                Gson gson = new Gson();
                UpdateBean mUpdateBean = gson.fromJson(post, UpdateBean.class);
                Log.e("TAG", "onSuccess:" + mUpdateBean);
            }
            return false;
        }
    });


    /**
     {
     "code":200,
     "data":{
     "butNames":"按键一",
     "equipmentNote":"一氧化碳(co)",
     "equipmentRoom":"客厅",
     "equipmentLabel":"客厅,主卧,次卧,厨房,阳台,洗手间,工作间,我在这里等着我呢"
     },
     "message":"查询成功"
     }
     *  */

    /**
     {
     "code":200,
     "data":{
     "equipmentId":"zcz002105405",
     "equipmentState":2,
     "userId":"minApp113043",
     "productId":"zcz002",
     "productName":"一氧化碳(co)",
     "equipmentNote":"一氧化碳4(co)",
     "equipmentRoom":"客厅",
     "equipmentIndex":"1",
     "butNames":"按键一",
     "isOn":"1",
     "equipmentType":"WIFI",
     "productVersion":"2.0.13",
     "equipmentVersion":"1.0.0",
     "share":0,
     "operateTime":"1650873606936"
     },
     "message":"数据操作成功"
     }
     *  */

}