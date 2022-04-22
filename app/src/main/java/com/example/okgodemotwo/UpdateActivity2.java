package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.request.base.Request;

import java.util.ArrayList;
import java.util.List;


public class UpdateActivity2 extends AppCompatActivity {

    String url = "https://www.mindordz.com:8181/mindor/mcl/updateModel";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {


        UpdateModelBean.DataBean mUpdateModelBean = new UpdateModelBean.DataBean();

        mUpdateModelBean.setEquipmentModelRepeat("7,1,2,3,4,5,6");
        mUpdateModelBean.setOver("false");
        mUpdateModelBean.setStateList("zcz002103910");
        mUpdateModelBean.setEquipmentModelId("model10730");


        mUpdateModelBean.setCreationDate("");
        mUpdateModelBean.setEquipmentList("zcz002103910");
        mUpdateModelBean.setEquipmentModelIcon("1");
        mUpdateModelBean.setEquipmentModelBeginTime("00:01");

        mUpdateModelBean.setOrderOnOff("1");
        mUpdateModelBean.setEquipmentModelEndTime("00:07");
        mUpdateModelBean.setEndIf("1");
        mUpdateModelBean.setEquipmentModelName("1");


        mUpdateModelBean.setBeginIf("1");
        mUpdateModelBean.setOnOff("1");

        mUpdateModelBean.setEquipmentDatas(null);

        List<UpdateModelBean.DataBean.EquipmentDatasBean> list = new ArrayList<>();


        UpdateModelBean.DataBean.EquipmentDatasBean mEquipmentDatasBean = new UpdateModelBean.DataBean.EquipmentDatasBean();

        mEquipmentDatasBean.setEquipmentId("zcz002103910");
        mEquipmentDatasBean.setIsOn("1");
        mEquipmentDatasBean.setEquipmentState(2);
        mEquipmentDatasBean.setProductName("一氧化碳(co)");

        mEquipmentDatasBean.setProductId("zcz002");
        mEquipmentDatasBean.setProductIcon("http://112.74.48.180/wanYe/images/equipment/zczco.png");
        mEquipmentDatasBean.setEquipmentNote("一氧化碳(co)");
        mEquipmentDatasBean.setEquipmentModelState(1);



        list.add(mEquipmentDatasBean);





        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateModelBean);
        OkGo.<String>post(url)
                .upJson(jsonString)
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        // UpdateBean mUpdateBean = JSONObject.parseObject(response.body(), UpdateBean.class);
                        Log.e("TAG", "onSuccess:" + response.body());
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        Log.e("TAG", "onStart:" + request);

                    }


                });
    }


}