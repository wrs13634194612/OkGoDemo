package com.example.okgodemotwo.remote;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.example.okgodemotwo.R;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;

public class ScheduleActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:6361/api/time/createAndUpdateRcTiming";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        getData();
    }

    private void getData() {
        ScheduleBean mScheduleBean = new ScheduleBean();
        mScheduleBean.setBrandId("1");
        mScheduleBean.setModeId("6a56dfd96d1657882000851");
        mScheduleBean.setProductId("zcz004");
        mScheduleBean.setEquipmentId("zcz004100411");
        mScheduleBean.setStartTime("12:09");
        mScheduleBean.setEndTime("13:09");
        mScheduleBean.setOpenIf(1);
        mScheduleBean.setCloseIf(1);
        mScheduleBean.setWeek("0");
        mScheduleBean.setId(0);
        Gson gson = new Gson();
        String jsonString = gson.toJson(mScheduleBean);
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
        "id":6,
        "brandId":"1",
        "modeId":"6a56dfd96d1657882000851",
        "productId":"zcz004",
        "equipmentId":"zcz004100411",
        "week":"0",
        "startTime":"12:09",
        "endTime":"13:09",
        "openIf":1,
        "closeIf":1,
        "createTime":"1658203446059"
    },
    "message":"操作成功"
}
* */