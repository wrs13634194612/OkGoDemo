package com.example.okgodemotwo;




        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;

        import com.alibaba.fastjson.JSONObject;
        import com.google.gson.Gson;
        import com.lzy.okgo.OkGo;
        import com.lzy.okgo.request.base.Request;


public class WarnUpdateActivity extends AppCompatActivity {
    private String url = "http://tt.mindordz.com:8381/mindor/ft/updateByHummer";


    /**
     口: https://www.mindordz.com:8181/mindor/ft/updateByHummer
     请求方式: POST
     接口说明: 根据实体更新蜂鸣数据,蜂鸣器设置接口发送
     查询传参测试(JSON字符串对象格式):
     data:{
     "equipmentId":"swt003vdee3f",
     "hummerState":1,
     "warnValue":40,
     "operate":0
     }

     接口更新返回格式:
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getData();
    }

    private void getData() {
        Gson gson = new Gson();

        WarnUpdateSendBean mWarnUpdateSendBean = new WarnUpdateSendBean();

        mWarnUpdateSendBean.setEquipmentId("zcz002105405");  //   3c6105d076c1
        mWarnUpdateSendBean.setWarnValue(19);
        mWarnUpdateSendBean.setHummerState(0);
        mWarnUpdateSendBean.setOperate(0);




        String jsonString = gson.toJson(mWarnUpdateSendBean);


        OkGo.<String>post(url)
                .params("data", jsonString)
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

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        Log.e("TAG", "onSuccess:" + request.toString());

                    }
                });
    }

    /**
     {"code":200,"data":{"equipmentId":"zcz002105405","productId":"zcz002","warnValue":19,"hummerState":0,"operate":0},"message":"数据操作成功"}
     * */

}