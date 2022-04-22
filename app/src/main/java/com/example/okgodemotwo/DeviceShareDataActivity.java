package com.example.okgodemotwo;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DeviceShareDataActivity extends AppCompatActivity {
    private String url = "https://www.mindordz.com:8181/mindor/dc/loadDevices";
    private RecyclerView gv_devices;
    private OnlineDeviceListAdapter mAdapter;
    private TextView tv_number;


    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message message) {
            if (message.what == 100) {
                String post = (String) message.obj;
                Gson gson = new Gson();
                DeviceDataBean mDeviceDataBean = gson.fromJson(post, DeviceDataBean.class);
                List<Device> mDevices = mDeviceDataBean.getData();
                Log.e("TAG", "AddActivity_onSuccess:" + post + "\n" + mDevices);
                tv_number.setText("分享条目数:"+mDevices.size());


                mAdapter = new OnlineDeviceListAdapter(DeviceShareDataActivity.this, mDevices);
                gv_devices.setLayoutManager(new GridLayoutManager(DeviceShareDataActivity.this, 4));
                gv_devices.setAdapter(mAdapter);
            }
            return false;
        }
    });

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        tv_number  = findViewById(R.id.tv_number);

        gv_devices = findViewById(R.id.rv_online_devices);


        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp113043")
                .params("type", "share")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        Log.e("TAG", "onSuccess:" + response.body());
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


}