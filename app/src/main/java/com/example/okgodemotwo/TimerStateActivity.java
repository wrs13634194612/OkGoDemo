package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.lzy.okgo.OkGo;


public class TimerStateActivity extends AppCompatActivity {
    String url = "https://www.mindordz.com:8181/mindor/time/getTimeState";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getData();
    }

    /**
     定时执行状态
     http://www.mindordz.com/wanYe/WanyeApiTiming_homePageSwt 旧

     https://www.mindordz.com:8181/mindor/time/getTimeState 新
     请求方式:GET
     新参数
     * */


    private void getData() {
        OkGo.<String>get(url)
                .params("equipmentId", "3c6105d076c1")
                .params("productId", "swt002")
                .params("userId", "minApp113043")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        ///    ShareReceiveBean mShareReceiveBean = JSONObject.parseObject(response.body(), ShareReceiveBean.class);
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body());
                    }

                    @Override
                    public void onError(com.lzy.okgo.model.Response<String> response) {
                        super.onError(response);
                        Log.e("TAG", "onError:" + response);
                    }
                });
    }


}