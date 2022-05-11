package com.example.okgodemotwo;


public class APIUtil {

    public interface CallBack<T extends BaseResult> {
        void handleResult(T result);
    }

}