package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.lzy.okgo.OkGo;

/*   查找所有遥控  * */
public class AllRemotesActivity extends AppCompatActivity {
    String url = "http://tt.mindordz.com:6361/api/hac/findModeByUserId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_remotes);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("userId", "minApp108881")
                .params("rooms", "客厅,厨房")
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
*
{
    "code":200,
    "data":{
        "rooms":"客厅,主卧,次卧,厨房,阳台,洗手间,工作间",
        "modes":[

        ],
        "rcSelectRooms":"客厅,厨房"
    },
    "message":"操作成功"
}
* */