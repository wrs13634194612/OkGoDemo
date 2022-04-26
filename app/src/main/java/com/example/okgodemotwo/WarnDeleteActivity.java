package com.example.okgodemotwo;


        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;

        import com.alibaba.fastjson.JSONObject;
        import com.google.gson.Gson;
        import com.lzy.okgo.OkGo;


public class WarnDeleteActivity extends AppCompatActivity {

    private String url = "http://tt.mindordz.com:8381/mindor/ft/deleteByHummer";


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

     *  */
}