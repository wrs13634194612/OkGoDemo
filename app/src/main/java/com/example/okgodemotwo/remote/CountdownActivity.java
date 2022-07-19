package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class CountdownActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:6361/api/time/createAndUpdateRcDelay";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);
        getData();
    }

    private void getData() {
        /**
         {
         "brandId": "1",
         "modeId": "0f30aaaa5d1655867968558",
         "productId": "zcz004",
         "equipmentId": "zcz00410tt0",
         "executeTime": "13:00",
         "switchStatus": 1
         }
         */
        CountDownBean mCountDownBean = new CountDownBean();
        mCountDownBean.setBrandId("1");
        mCountDownBean.setModeId("0f30aaaa5d1655867968558");
        mCountDownBean.setProductId("zcz004");
        mCountDownBean.setEquipmentId("zcz00410tt0");
        mCountDownBean.setExecuteTime("13:00");
        mCountDownBean.setSwitchStatus(1);

        Gson gson = new Gson();
        String jsonString = gson.toJson(mCountDownBean);
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
    "data":{
        "id":46,
        "brandId":"1",
        "modeId":"0f30aaaa5d1655867968558",
        "productId":"zcz004",
        "equipmentId":"zcz00410tt0",
        "executeTime":"13:00",
        "executeTimePoint":"00:03:10",
        "switchStatus":1,
        "createTime":"1658199793994"
    },
    "message":"操作成功"
}
* */