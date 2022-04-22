package com.example.okgodemotwo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RoomActivity extends AppCompatActivity {

    String url = "https://www.mindordz.com:8181/mindor/dc/getDeviceRoom";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);
        getData();
    }


    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp113043")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        // ShareReceiveBean mShareReceiveBean = JSONObject.parseObject(response.body(), ShareReceiveBean.class);
                        Log.e("TAG", "AddActivity_onSuccess:" + response.body());
                        Message msg = new Message();
                        msg.what = 100;
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
            if (message.what == 100) {
                String post = (String) message.obj;
                Gson gson = new Gson();
                RoomNumBean mRoomNumBean = gson.fromJson(post, RoomNumBean.class);


                List<RoomNumBean.DataBean> mDevices = new ArrayList<>();
                List<RoomNumBean.DataBean> mDevices2 = new ArrayList<>();
                mDevices.addAll(mRoomNumBean.getData());
                for (int i = 0; i < mDevices.size(); i++) {
                    if (!mDevices.get(i).getList().isEmpty()) {
                        mDevices2.add(mDevices.get(i));
                    }
                }
                Log.e("TAG", "AddActivity_onSuccess:" +mDevices+"\t"+ mDevices2);




            }
            return false;
        }
    });


}
