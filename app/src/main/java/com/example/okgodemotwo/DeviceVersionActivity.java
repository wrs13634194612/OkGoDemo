//package com.example.okgodemotwo;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.gson.Gson;
//import com.lzy.okgo.OkGo;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class DeviceVersionActivity {
//}
//package com.example.okgodemotwo;
//
//
//        import androidx.annotation.Nullable;
//        import androidx.appcompat.app.AppCompatActivity;
//
//        import android.os.Bundle;
//        import android.util.Log;
//        import android.view.View;
//        import android.widget.Button;
//
//        import com.alibaba.fastjson.JSONObject;
//        import com.google.gson.Gson;
//        import com.lzy.okgo.OkGo;
//
//        import java.math.BigDecimal;
//        import java.util.ArrayList;
//        import java.util.Collections;
//        import java.util.List;
//
//
//public class PowerActivity extends AppCompatActivity {
//    private String todayUrl = "https://www.mindordz.com:8181/mindor/pw/getPowerCountByToday";
//
//    private String weekUrl = "https://www.mindordz.com:8181/mindor/pw/getPowerCountBySevenDay";
//    private String monthUrl = "https://www.mindordz.com:8181/mindor/pw/getPowerCountByThirtyDay";
//
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_power);
//        //getData();
//
//        Button btn_today = findViewById(R.id.btn_today);
//        Button btn_week = findViewById(R.id.btn_week);
//        Button btn_month = findViewById(R.id.btn_month);
//
//        btn_today.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getTodayData();
//            }
//        });
//        btn_week.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getWeekData();
//            }
//        });
//        btn_month.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                getMonthData();
//            }
//        });
//    }
//
//    private void getTodayData() {
//        OkGo.<String>get(todayUrl)
//                .params("equipmentId", "zcz002103910")
//                .execute(new com.lzy.okgo.callback.StringCallback() {
//                    @Override
//                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
//                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n");
//
//                        Gson gson = new Gson();
//                        PowerTodayBean mPowerTodayBean = gson.fromJson(response.body(), PowerTodayBean.class);
//                        double name = mPowerTodayBean.getData().getSumAvg().getSum();
//
//                        BigDecimal age = new BigDecimal(name);
//                        double f1 = age.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//
//
//                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n" + f1);
//
//
//                    }
//
//                    @Override
//                    public void onError(com.lzy.okgo.model.Response<String> response) {
//                        super.onError(response);
//                        Log.e("TAG", "onError:" + response);
//                    }
//                });
//    }
//
//    private void getWeekData() {
//        OkGo.<String>get(weekUrl)
//                .params("equipmentId", "zcz002103910")
//                .execute(new com.lzy.okgo.callback.StringCallback() {
//                    @Override
//                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
//
//                        Gson gson = new Gson();
//                        PowerWeekBean mPowerWeekBean = gson.fromJson(response.body(), PowerWeekBean.class);
//                        double name = mPowerWeekBean.getData().getSevenSumAvg().getSum();
//
//
//                        List<PowerWeekBean.DataBean.SevenDataListBean> mList = new ArrayList<>();
//                        mList.addAll(mPowerWeekBean.getData().getSevenDataList());
//
//
//
//
//
//
//                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n" + name+mList);
//
//                        List<Double> sumList = new ArrayList<>();
//                        if (!sumList.isEmpty()) {
//                            sumList.clear();
//                        }
//                        for (int i = 0; i < mList.size(); i++) {
//                            sumList.add(mList.get(i).getSum());
//                        }
//                        double maxNUm = Collections.max(sumList);
//                        double mimNUm = Collections.min(sumList);
//                        System.out.println("" + sumList + maxNUm + mimNUm);
//
//
//
//                    }
//
//                    @Override
//                    public void onError(com.lzy.okgo.model.Response<String> response) {
//                        super.onError(response);
//                        Log.e("TAG", "onError:" + response);
//                    }
//                });
//    }
//
//
//    private void getMonthData() {
//        OkGo.<String>get(monthUrl)
//                .params("equipmentId", "zcz002103910")
//                .execute(new com.lzy.okgo.callback.StringCallback() {
//                    @Override
//                    public void onSuccess(com.lzy.okgo.model.Response<String> response) {
//                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n");
//
//                        Gson gson = new Gson();
//                        PowerMonthBean mPowerMonthBean = gson.fromJson(response.body(), PowerMonthBean.class);
//                        List<PowerMonthBean.DataBean.ThirtyDayDataBean> mList = new ArrayList<>();
//                        mList.addAll(mPowerMonthBean.getData().getThirtyDayData());
//                        Log.e("TAG", "AddActivity_onSuccess:" + response.body() + "\n"    +mList);
//                        List<Double> sumMonthList = new ArrayList<>();
//                        if (!sumMonthList.isEmpty()) {
//                            sumMonthList.clear();
//                        }
//                        for (int i = 0; i < mList.size(); i++) {
//                            sumMonthList.add(mList.get(i).getSum());
//                        }
//                        double maxNUm = Collections.max(sumMonthList);
//                        double mimNUm = Collections.min(sumMonthList);
//                        System.out.println("" + sumMonthList + maxNUm + mimNUm);
//                    }
//
//                    @Override
//                    public void onError(com.lzy.okgo.model.Response<String> response) {
//                        super.onError(response);
//                        Log.e("TAG", "onError:" + response);
//                    }
//                });
//    }
//    /**
//     {
//     "code":200,
//     "data":{
//     "butNames":"按键一",
//     "equipmentNote":"一氧化碳(co)",
//     "equipmentRoom":"客厅",
//     "equipmentLabel":"客厅,主卧,次卧,厨房,阳台,洗手间,工作间,我在这里等着我呢"
//     },
//     "message":"查询成功"
//     }
//     *  */
//
//}