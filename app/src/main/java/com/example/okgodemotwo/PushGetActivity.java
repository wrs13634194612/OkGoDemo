package com.example.okgodemotwo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.request.base.Request;

public class PushGetActivity extends AppCompatActivity {
    private String url = "http://192.168.101.9:8881/api/msg/getAccountId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("accountId", "minApp108881")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body());
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

/**
 {
 "data":{
 "list":[
 {
 "args":"{\"msg\":\"您有设备定时已执行\",\"messageId\":\"50aed58b72c54bfd9aee15d18b22\",\"model\":\"power\"}",
 "accountId":"minApp108881",
 "createTime":"2022-04-28 04:24:13",
 "isRead":0,
 "type":"power",
 "uuid":"50aed58b72c54bfd9aee15d18b22",
 "content":"您有设备定时已执行1"
 },
 {
 "args":"{\"msg\":\"您有设备定时已执行\",\"messageId\":\"470859b59a6f4ae2a0ec30dfc67f\",\"model\":\"power\"}",
 "accountId":"minApp108881",
 "createTime":"2022-04-27 04:25:00",
 "isRead":0,
 "type":"power",
 "uuid":"470859b59a6f4ae2a0ec30dfc67f",
 "content":"您有设备定时已执行"
 }
 ],
 "unReadCount":2
 },
 "message":"查询成功",
 "code":200
 }
* */
