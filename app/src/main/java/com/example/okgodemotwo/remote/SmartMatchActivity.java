package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.lzy.okgo.OkGo;

/*   查找所有遥控  * */
public class SmartMatchActivity extends AppCompatActivity {
    String url = "http://tt.mindordz.com:6361/api/hac/learnCode";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_match);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("deviceId", "5")
                .params("code", "01BE,2F,D926AFD068178")
                .params("equipmentId", "zcz004100411")
                .params("userId", "minApp108881")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        //AllBean mAllBean = JSONObject.parseObject(response.body(), AllBean.class);
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

