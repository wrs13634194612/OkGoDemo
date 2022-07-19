package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

public class RemoteConfirmActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:6361/api/hac/createAndUpdateMode";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_confirm);
        getData();
    }

    private void getData() {
        /**
         {
         "userId":"minApp108881",
         "productId":"zcz004",
         "equipmentId":"zcz004100411",
         "modeId":"6a56dfd96d1657882000851",
         "nick":"美的电风扇",
         "rcRoom":"客厅",
         "infraredBinId":0,
         "brand_id":"1119",
         "kfid":"50182",
         "device_id":"5",
         "modeHead":"013D,12",
         "rcOperateCode":"05,00,00,00,01,01"
         }
         */
        RemoteConfirmBean mRemoteConfirmBean = new RemoteConfirmBean();
        mRemoteConfirmBean.setUserId("minApp108881");
        mRemoteConfirmBean.setProductId("zcz004");
        mRemoteConfirmBean.setEquipmentId("zcz004100411");
        mRemoteConfirmBean.setModeId("6a56dfd96d1657882000851");
        mRemoteConfirmBean.setNick("美的电风扇");
        mRemoteConfirmBean.setRcRoom("客厅");
        mRemoteConfirmBean.setInfraredBinId(0);
        mRemoteConfirmBean.setBrandId("1119");
        mRemoteConfirmBean.setKfId("50182");
        mRemoteConfirmBean.setDeviceId("5");
        mRemoteConfirmBean.setModeHead("013D,12");
        mRemoteConfirmBean.setRcOperateCode("05,00,00,00,01,01");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mRemoteConfirmBean);
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
*
{
    "code":200,
    "data":{
        "equipmentNote":"红外遥控",
        "device_id":"5",
        "kfid":"50182",
        "userId":"minApp108881",
        "productId":"zcz004",
        "infraredBinId":18,
        "equipmentId":"zcz004100411",
        "mac":"df3c66db8eded811",
        "brand_id":"1119",
        "nick":"美的电风扇",
        "equipmentState":2,
        "rcRoom":"客厅",
        "rcOperateCode":"05,00,00,00,01,01",
        "modeId":"6a56dfd96d1657882000851",
        "modeHead":"013D,12",
        "rcCreateTime":"1658202120276"
    },
    "message":"操作成功"
}
* */