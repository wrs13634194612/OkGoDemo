package com.example.okgodemotwo;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PushJsonActivity extends AppCompatActivity {


    List<PushSocketAllBean.DataBean.ListBean> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_json);
        Button btn_first_connect = findViewById(R.id.btn_first_connect);
        Button btn_push_other_share = findViewById(R.id.btn_push_other_share);


        btn_first_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstAssests();
            }
        });
        btn_push_other_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }


    public void firstAssests() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("me.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        /*
                boolean status = json.contains("message");
                int result1 = json.indexOf("message");
                if (result1 != -1) {
                    System.out.println("字符串str中包含子串“ab”" + result1);
                } else {
                    System.out.println("字符串str中不包含子串“ab”" + result1);
                }
                Log.e("TAG", "wrs_one:" + json.startsWith("message"));
                Log.e("TAG", "wrs_two:" + json.startsWith("message", 11));
                Log.e("TAG", "wrs_three:" + status);
                Log.e("TAG", "wrs_four:" + result1);
        */


        Gson gson = new Gson();
        ShareOtherBean mShareOtherBean = gson.fromJson(json, ShareOtherBean.class);
        String titleString = mShareOtherBean.getAlert().getTitle();
        String bodyString = mShareOtherBean.getAlert().getBody();

        Log.e("TAG", "loadJsonFromAssests:" + json + titleString + bodyString);








      /*  Gson gson = new Gson();
        PushSocketAllBean mPushSocketAllBean = gson.fromJson(json, PushSocketAllBean.class);
        list = new ArrayList<>();
        list.addAll(mPushSocketAllBean.getData().getList());
        //21  如果type=分享的东西才能解析
        String argTest = list.get(21).getArgs();


        PushMsgDetailBean mPushMsgDetailBean = gson.fromJson(argTest, PushMsgDetailBean.class);
        String mEquipments = mPushMsgDetailBean.getEquipments();
        Type type = new TypeToken<List<ScanCodeDeviceBean>>() {}.getType();
        List<ShareEquipmentsBean> equipmentsList = gson.fromJson(mEquipments, type);
        Log.e("TAG", "loadJsonFromAssests:" + json.length() + "\t" + list + equipmentsList);
        */
    }


    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }


    public void otherAssests() {
        String json = null;
        try {
            InputStream inputStream = getAssets().open("othershare.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Gson gson = new Gson();
        ShareOtherBean mShareOtherBean = gson.fromJson(json, ShareOtherBean.class);
        String userInfo = mShareOtherBean.getUserinfo();


        ShareUserInfoBean mShareUserInfoBean = gson.fromJson(userInfo, ShareUserInfoBean.class);


        String equipments = mShareUserInfoBean.getEquipments();
        Type type = new TypeToken<List<ShareEquipmentsBean>>() {
        }.getType();
        List<ShareEquipmentsBean> list = gson.fromJson(equipments, type);
        String eqString = list.get(0).getEquipmentNote();
        Log.e("TAG", "loadJsonFromAssests:" + json.length() + "\t" + userInfo + "\t" + equipments + "\t" + eqString);
    }


}

/**
 * {
 * "token":"scka8e8c0a85a0b1e82b9d1cf9g0e853f9f6278ef99f3ga7f0d5a1aa98f57338",
 * "userId":"minApp113043",
 * "message":"连接成功"
 * }
 * <p>
 * {
 * "badge":1,
 * "alert":{
 * "title":"分享消息",
 * "body":"你的好友1向你分享1台设备"
 * },
 * "sound":"default",
 * "userinfo":"{\"msg\":\"你的好友用户：null向您分享了1个设备,点击确认\",\"equipments\":\"[{\\\"equipmentNote\\\":\\\"智能插座\\\",\\\"productId\\\":\\\"zcz001\\\",\\\"equipmentId\\\":\\\"zcz001101027\\\"}]\",\"messageId\":\"a7f0fb9ddb0c4f6fb3b56be6b114\",\"model\":\"accountShare\",\"shareId\":\"minApp113988\",\"id\":133.0}"
 * }
 * <p>
 * {
 * "msg":"你的好友用户：null向您分享了1个设备,点击确认",
 * "equipments":"[{\"equipmentNote\":\"智能插座\",\"productId\":\"zcz001\",\"equipmentId\":\"zcz001101027\"}]",
 * "messageId":"a7f0fb9ddb0c4f6fb3b56be6b114",
 * "model":"accountShare",
 * "shareId":"minApp113988",
 * "id":133
 * }
 * <p>
 * [
 * {
 * "equipmentNote":"智能插座",
 * "productId":"zcz001",
 * "equipmentId":"zcz001101027"
 * }
 * ]
 */