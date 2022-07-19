package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.lzy.okgo.OkGo;

// 品牌匹配
public class BrandMatchActivity extends AppCompatActivity {
    String url = "http://tt.mindordz.com:6361/api/hac/brandMatch";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand_match);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("deviceId", 1)
                .params("brandId", 3)
                .params("userId", "minApp108881")
                .params("equipmentId", "zcz004101012")
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

/**
{
    "code":200,
    "data":{
        "rooms":"客厅,主卧,次卧,厨房,阳台,洗手间,工作间",
        "delays":null,
        "timings":null,
        "rcRooms":"客厅,厨房",
        "list":[
            {
                "keyIndex":0,
                "keyName":"开"
            },
            {
                "keyIndex":1,
                "keyName":"关"
            },
            {
                "keyIndex":2,
                "keyName":"自动"
            },
            {
                "keyIndex":3,
                "keyName":"制冷"
            },
            {
                "keyIndex":4,
                "keyName":"除湿"
            },
            {
                "keyIndex":5,
                "keyName":"送风"
            },
            {
                "keyIndex":6,
                "keyName":"制热"
            },
            {
                "keyIndex":7,
                "keyName":"温度+"
            },
            {
                "keyIndex":8,
                "keyName":"温度-"
            },
            {
                "keyIndex":9,
                "keyName":"风速+"
            },
            {
                "keyIndex":10,
                "keyName":"风速-"
            },
            {
                "keyIndex":11,
                "keyName":"风向+"
            },
            {
                "keyIndex":12,
                "keyName":"风向-"
            }
        ],
        "entity":{
            "equipmentNote":"名豆插座2",
            "device_id":"1",
            "kfid":"10122",
            "userId":"minApp108881",
            "productId":"zcz004",
            "infraredBinId":0,
            "equipmentId":"zcz004101012",
            "mac":"df3c66db8eded811",
            "brand_id":"3",
            "nick":"美的空调",
            "equipmentState":1,
            "rcRoom":"客厅",
            "rcOperateCode":"01,00,00,00,00,10,00,00,00",
            "modeId":"3ab41a36f61658116251001",
            "modeHead":"01BA,01BD",
            "rcCreateTime":"1658199123265"
        }
    },
    "message":"操作成功"
}
* */