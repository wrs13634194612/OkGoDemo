package com.example.okgodemotwo;





        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;

        import com.alibaba.fastjson.JSONObject;
        import com.lzy.okgo.OkGo;



public class SearchDeviceActivity extends AppCompatActivity {
    String url = "https://www.mindordz.com:8181/mindor/mcl/getModel";


    /**

     查找模式-详情-内部设备
     http://www.mindordz.com/wanYe/WanyeApiEquipmentModel_equipmentModelListById 旧
     https://www.mindordz.com:8181/mindor/mcl/getModel 新
     请求方式:GET
     新参数
     modelId, 字符串
     userId 字符串
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        getData();
    }

    private void getData() {
        OkGo.<String>get(url)
                .params("modelId", "model10730")
                .params("userId", "minApp113988")
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
                });
    }


}