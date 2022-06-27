package com.example.okgodemotwo;

        import java.util.List;
        import java.io.Serializable;

public class PowerTodayBean {
    /**
     * code : 200
     * data : {"lastTime":"2022-05-17 05:17:57","min":{"createTime":"22-05-17 09:00:00","max":"0.0010"},"max":{"createTime":"22-05-17 00:00:00","max":"0.0010"},"sumAvg":{"sum":0.168,"avg":0.0168},"listToday":[{"power":"0.0010","time":"22-05-17 00:00:00"},{"power":"0.0680","time":"22-05-17 01:00:00"},{"power":"0.0010","time":"22-05-17 02:00:00"},{"power":"0.0010","time":"22-05-17 03:00:00"},{"time":"22-05-17 04:00:00","power":"0.0920"},{"time":"22-05-17 05:00:00","power":"0.0010"},{"power":"0.0010","time":"22-05-17 06:00:00"},{"power":"0.0010","time":"22-05-17 07:00:00"},{"power":"0.0010","time":"22-05-17 08:00:00"},{"power":"0.0010","time":"22-05-17 09:00:00"}]}
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
         * lastTime : 2022-05-17 05:17:57
         * min : {"createTime":"22-05-17 09:00:00","max":"0.0010"}
         * max : {"createTime":"22-05-17 00:00:00","max":"0.0010"}
         * sumAvg : {"sum":0.168,"avg":0.0168}
         * listToday : [{"power":"0.0010","time":"22-05-17 00:00:00"},{"power":"0.0680","time":"22-05-17 01:00:00"},{"power":"0.0010","time":"22-05-17 02:00:00"},{"power":"0.0010","time":"22-05-17 03:00:00"},{"time":"22-05-17 04:00:00","power":"0.0920"},{"time":"22-05-17 05:00:00","power":"0.0010"},{"power":"0.0010","time":"22-05-17 06:00:00"},{"power":"0.0010","time":"22-05-17 07:00:00"},{"power":"0.0010","time":"22-05-17 08:00:00"},{"power":"0.0010","time":"22-05-17 09:00:00"}]
         */

        private String lastTime;
        private MinBean min;
        private MaxBean max;
        private SumAvgBean sumAvg;
        private List<ListTodayBean> listToday;

        public String getLastTime() {
            return lastTime;
        }

        public void setLastTime(String lastTime) {
            this.lastTime = lastTime;
        }

        public MinBean getMin() {
            return min;
        }

        public void setMin(MinBean min) {
            this.min = min;
        }

        public MaxBean getMax() {
            return max;
        }

        public void setMax(MaxBean max) {
            this.max = max;
        }

        public SumAvgBean getSumAvg() {
            return sumAvg;
        }

        public void setSumAvg(SumAvgBean sumAvg) {
            this.sumAvg = sumAvg;
        }

        public List<ListTodayBean> getListToday() {
            return listToday;
        }

        public void setListToday(List<ListTodayBean> listToday) {
            this.listToday = listToday;
        }

        public static class MinBean implements Serializable {
            /**
             * createTime : 22-05-17 09:00:00
             * max : 0.0010
             */

            private String createTime;
            private String max;

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }
        }

        public static class MaxBean implements Serializable {
            /**
             * createTime : 22-05-17 00:00:00
             * max : 0.0010
             */

            private String createTime;
            private String max;

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }
        }

        public static class SumAvgBean implements Serializable {
            /**
             * sum : 0.168
             * avg : 0.0168
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

        public static class ListTodayBean implements Serializable {
            /**
             * power : 0.0010
             * time : 22-05-17 00:00:00
             */

            private String power;
            private String time;

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}

