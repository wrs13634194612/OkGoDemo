package com.example.okgodemotwo;



        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Message;
        import android.util.Log;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.GridLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import com.alibaba.fastjson.JSONObject;
        import com.google.gson.Gson;
        import com.lzy.okgo.OkGo;
        import com.lzy.okgo.request.base.Request;

        import java.util.ArrayList;
        import java.util.LinkedHashSet;
        import java.util.List;

public class WarnGetActivity extends AppCompatActivity {

    private String url = "http://tt.mindordz.com:8381/mindor/ft/getByHummer";


    /**
     鸣数据
     接口: https://www.mindordz.com:8181/mindor/ft/getByHummer
     请求方式: GET
     接口说明: 根据ID来获取设备蜂鸣数据
     查询传参测试(KEY-VA
     * */


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);



        getData();
    }


    private void getData() {
        OkGo.<String>get(url)
                .params("equipmentId", "zcz002105405")
                .execute(new com.lzy.okgo.callback.StringCallback() {
                    @Override
                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
                        // ShareReceiveBean mShareReceiveBean = JSONObject.parseObject(response.body(), ShareReceiveBean.class);
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
                        Log.e("TAG", "onError:" + request);

                    }
                });
    }

    /**
     {"code":200,"data":{"equipmentId":"zcz002105405","productId":"zcz002","warnValue":22,"hummerState":1,"operate":2},"message":"查询成功"}
     * */

}
