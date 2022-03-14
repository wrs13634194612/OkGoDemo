package com.example.okgodemotwo;


import android.app.Application;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cookie.CookieJarImpl;
import com.lzy.okgo.cookie.store.SPCookieStore;

import okhttp3.OkHttpClient;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initNet();

    }


    private void initNet() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cookieJar(new CookieJarImpl(new SPCookieStore(this)));
        OkGo.getInstance().setOkHttpClient(builder.build());
        OkGo.getInstance().init(this);
    }
}
