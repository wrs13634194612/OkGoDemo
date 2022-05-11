package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;


public class PushSendMsgActivity extends AppCompatActivity {
    private String url2 = "http://192.168.101.9:8881/api/push/sendNotification";


    private String url ="http://192.168.101.227:8881/api/push/sendNotification";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getDataPush();
    }

    private void getDataPush() {
        PushMsgDataBean mPushMsgDataBean = new PushMsgDataBean();
        mPushMsgDataBean.setPlatform("android");
        mPushMsgDataBean.setAccountId("minApp113988");
        mPushMsgDataBean.setSound("default");

        mPushMsgDataBean.setType("alert");

//        mPushMsgDataBean.setStatus(true);
//        mPushMsgDataBean.setMessageType("share");
        mPushMsgDataBean.setMessageContent("{\"msg\":\"请求授权信息\",\"model\":\"accountShare\"}");
        Gson gson = new Gson();
        String jsonString = gson.toJson(mPushMsgDataBean);
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