package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.request.base.Request;


public class ElectricityUpdateActivity extends AppCompatActivity {
    String url3 = "https://www.mindordz.com:8181/mindor/ft/updateByAppliance";
    private String url = "http://tt.mindordz.com:8381/mindor/ft/updateByAppliance";


    /**
     * 接口: http://www.mindordz.com:8381/mindor/ft/updateByAppliance
     * 请求方式: PUT
     * 接口说明: 根据设备ID、延时、功率、状态更新家电保护数据,接口内容发送
     * 查询传参测试(JSON对象格式):
      {
          "equipmentId":"swt003vdee3f",
          "status":0,
      "delay":10,
      "standbyPower":15
      }
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getData();
    }

    private void getData() {
        Gson gson = new Gson();

        ElectricityUpdateSendBean mElectricityUpdateSendBean = new ElectricityUpdateSendBean();

        mElectricityUpdateSendBean.setEquipmentId("zcz002105405");  //   3c6105d076c1
        mElectricityUpdateSendBean.setDelay(14);
        mElectricityUpdateSendBean.setStandbyPower(22);
        mElectricityUpdateSendBean.setStatus(0);


        /**  2 ： 开 ， 0 ： 关闭
         {"code":200,"data":{"equipmentId":"zcz002105405","delay":10,"standbyPower":15,"status":2},"message":"查询成功"}
         {"code":200,"data":{"equipmentId":"zcz002105405","delay":10,"standbyPower":15,"status":0},"message":"查询成功"}
        * */


        String jsonString = gson.toJson(mElectricityUpdateSendBean);


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

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        Log.e("TAG", "onSuccess:" + request.toString());

                    }
                });
    }

    /**
     {
     "code":200,
     "data":{
     "equipmentId":"3c6105d076c1",
     "delay":0,
     "standbyPower":10,
     "status":15
     },
     "message":"数据操作成功"
     }
    * */

}