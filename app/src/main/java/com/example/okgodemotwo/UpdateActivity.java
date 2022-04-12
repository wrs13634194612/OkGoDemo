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


public class UpdateActivity extends AppCompatActivity {

    String url = "https://www.mindordz.com:8181/mindor/mcl/updateModel";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        getData();
    }

    private void getData() {
        UpdateModelSendBean mUpdateModelSendBean = new UpdateModelSendBean();
        List<UpdateModelSendBean.EquipmentDatasBean> list = new ArrayList<>();
        UpdateModelSendBean.EquipmentDatasBean mEquipmentDatasBean = new UpdateModelSendBean.EquipmentDatasBean();
        mEquipmentDatasBean.setEquipmentType("");
        mEquipmentDatasBean.setIsOn("0");
        mEquipmentDatasBean.setEquipmentModelState(2);
        mEquipmentDatasBean.setEquipmentState(2);
        mEquipmentDatasBean.setShare(0);
        mEquipmentDatasBean.setIsSelected(false);
        mEquipmentDatasBean.setProductId("");
        mEquipmentDatasBean.setEquipmentVersion("");
        mEquipmentDatasBean.setProductImage("");
        mEquipmentDatasBean.setEquipmentLabel("");
        mEquipmentDatasBean.setProductIcon("http://112.74.48.180/wanYe/images/equipment/zczco.png");
        mEquipmentDatasBean.setEquipmentNote("一氧化碳(co)");
        mEquipmentDatasBean.setEquipmentRoom("");
        mEquipmentDatasBean.setEquipmentState(0);
        mEquipmentDatasBean.setIndexs("");
        mEquipmentDatasBean.setIsBleDevice(false);
        mEquipmentDatasBean.setProductName("");
        mEquipmentDatasBean.setButNames("");
        mEquipmentDatasBean.setOperateTime("");
        mEquipmentDatasBean.setEquipmentName("");
        mEquipmentDatasBean.setProductVersion("");
        mEquipmentDatasBean.setEquipmentId("zcz002103910");
        list.add(mEquipmentDatasBean);

        /**
         {
         "equipmentModelId":"model10730",
         "equipmentModelName":"1",
         "equipmentModelIcon":"1",
         "equipmentModelRepeat":"7,1,2,3,4,5,6",
         "equipmentList":"zcz002103910",
         "stateList":"zcz002103910",
         "equipmentModelBeginTime":"00:01",
         "equipmentModelEndTime":"00:06",
         "beginIf":"1",
         "endIf":"1",
         "onOff":"1"
         }
         */

        mUpdateModelSendBean.setEquipmentModelRepeat("7,1,2,3,4,5,6");
        mUpdateModelSendBean.setEquipmentModelIcon(1);
        mUpdateModelSendBean.setEquipmentModelName("1");
        mUpdateModelSendBean.setOnOff(1);
        mUpdateModelSendBean.setEndIf(1);
        mUpdateModelSendBean.setEquipmentList("zcz002103910");
        mUpdateModelSendBean.setEquipmentModelId("model10730");
        mUpdateModelSendBean.setEquipmentModelBeginTime("00:01");
        mUpdateModelSendBean.setOrderOnOff(1);
        mUpdateModelSendBean.setBeginIf(1);
        mUpdateModelSendBean.setOver(false);
        mUpdateModelSendBean.setCreationDate("");
        mUpdateModelSendBean.setStateList("zcz002103910");
        mUpdateModelSendBean.setEquipmentDatas(list);
        mUpdateModelSendBean.setEquipmentModelEndTime("00:06");
        mUpdateModelSendBean.setUserId("minApp113988");

        /**
         OkGo.post<String>(GATE_HOST + "time/createGatewayDeviceDelayTiming")
         .params("data", Gson().toJson(brand))
         .execute(object : StringCallback() {
         override fun onSuccess(response: Response<String>?) {
         println("createGatewayDeviceDelayTiming" + response?.body())
         dismissLoadingDialog()
         finish()
         }
         .upJson(jsonString)

         })
         */


        Gson gson = new Gson();
        String jsonString = gson.toJson(mUpdateModelSendBean);
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