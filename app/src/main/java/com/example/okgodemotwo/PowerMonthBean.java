package com.example.okgodemotwo;


        import java.util.List;
        import java.io.Serializable;


public class PowerMonthBean {
    /**
     * code : 200
     * data : {"lastTime":"2022-05-17 05:18:53","thirtyDay":{"sum":3.401,"avg":0.0281},"thirtyDayData":[{"sum":0.001,"dayTime":"22-04-20"},{"sum":0.133,"dayTime":"22-04-21"},{"sum":0.694,"dayTime":"22-04-22"},{"sum":0.345,"dayTime":"22-04-23"},{"dayTime":"22-04-25","sum":0.312},{"dayTime":"22-04-26","sum":0.082},{"dayTime":"22-04-27","sum":0.043},{"dayTime":"22-04-28","sum":0.098},{"sum":0.153,"dayTime":"22-04-29"},{"dayTime":"22-05-03","sum":0.16},{"sum":0.206,"dayTime":"22-05-04"},{"dayTime":"22-05-05","sum":0.216},{"dayTime":"22-05-07","sum":0.035},{"dayTime":"22-05-09","sum":0.178},{"sum":0.257,"dayTime":"22-05-10"},{"dayTime":"22-05-16","sum":0.32},{"dayTime":"22-05-17","sum":0.168}]}
     * message : 查询成功
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean implements Serializable {
        /**
         * lastTime : 2022-05-17 05:18:53
         * thirtyDay : {"sum":3.401,"avg":0.0281}
         * thirtyDayData : [{"sum":0.001,"dayTime":"22-04-20"},{"sum":0.133,"dayTime":"22-04-21"},{"sum":0.694,"dayTime":"22-04-22"},{"sum":0.345,"dayTime":"22-04-23"},{"dayTime":"22-04-25","sum":0.312},{"dayTime":"22-04-26","sum":0.082},{"dayTime":"22-04-27","sum":0.043},{"dayTime":"22-04-28","sum":0.098},{"sum":0.153,"dayTime":"22-04-29"},{"dayTime":"22-05-03","sum":0.16},{"sum":0.206,"dayTime":"22-05-04"},{"dayTime":"22-05-05","sum":0.216},{"dayTime":"22-05-07","sum":0.035},{"dayTime":"22-05-09","sum":0.178},{"sum":0.257,"dayTime":"22-05-10"},{"dayTime":"22-05-16","sum":0.32},{"dayTime":"22-05-17","sum":0.168}]
         */

        private String lastTime;
        private ThirtyDayBean thirtyDay;
        private List<ThirtyDayDataBean> thirtyDayData;

        public String getLastTime() {
            return lastTime;
        }

        public void setLastTime(String lastTime) {
            this.lastTime = lastTime;
        }

        public ThirtyDayBean getThirtyDay() {
            return thirtyDay;
        }

        public void setThirtyDay(ThirtyDayBean thirtyDay) {
            this.thirtyDay = thirtyDay;
        }

        public List<ThirtyDayDataBean> getThirtyDayData() {
            return thirtyDayData;
        }

        public void setThirtyDayData(List<ThirtyDayDataBean> thirtyDayData) {
            this.thirtyDayData = thirtyDayData;
        }

        public static class ThirtyDayBean implements Serializable {
            /**
             * sum : 3.401
             * avg : 0.0281
             */

            private double sum;
            private double avg;

            public double getSum() {
                return sum;
            }

            public void setSum(double sum) {
                this.sum = sum;
            }

            public double getAvg() {
                return avg;
            }

            public void setAvg(double avg) {
                this.avg = avg;
            }
        }

        public static class ThirtyDayDataBean implements Serializable {
            /**
             * sum : 0.001
             * dayTime : 22-04-20
             */

            private double sum;
            private String dayTime;

            public double getSum() {
                return sum;
            }

            public void setSum(double sum) {
                this.sum = sum;
            }

            public String getDayTime() {
                return dayTime;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }
        }
    }
}
