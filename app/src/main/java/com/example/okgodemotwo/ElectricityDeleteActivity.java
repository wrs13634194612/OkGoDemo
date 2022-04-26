package com.example.okgodemotwo;



        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;

        import com.alibaba.fastjson.JSONObject;
        import com.google.gson.Gson;
        import com.lzy.okgo.OkGo;


public class ElectricityDeleteActivity extends AppCompatActivity {
        String url3 = "http://www.mindordz.com:8381/mindor/ft/deleteByAppliance";

        private String url = "http://tt.mindordz.com:8381/mindor/ft/deleteByAppliance";


        /**
         除家电保护数据
         接口: http://www.mindordz.com:8381/mindor/ft/deleteByAppliance
         请求方式: DELETE
         接口说明: 根据设备ID删除家电保护数据
         删除传参测试(KEY-VALUE格式):
         {
          "equipmentId":"swt003vdee3f"
         }
         接口删除返回格式:
         *
         * */

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_test);
                getData();
        }



        private void getData() {
                OkGo.<String>delete(url)
                        .params("equipmentId", "zcz002105405")
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

        /**
         {
         "code":200,
         "message":"删除成功"
         }
         *  */
}