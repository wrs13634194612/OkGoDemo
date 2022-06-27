package com.example.okgodemotwo;


        import java.util.List;
        import java.io.Serializable;

public class PowerWeekBean {
    /**
     * code : 200
     * data : {"lastTime":"2022-05-17 05:18:22","sevenDataList":[{"sum":0.257,"dayTime":"22-05-10"},{"dayTime":"22-05-16","sum":0.32},{"dayTime":"22-05-17","sum":0.168}],"sevenSumAvg":{"sum":0.745,"avg":0.0324}}
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
         * lastTime : 2022-05-17 05:18:22
         * sevenDataList : [{"sum":0.257,"dayTime":"22-05-10"},{"dayTime":"22-05-16","sum":0.32},{"dayTime":"22-05-17","sum":0.168}]
         * sevenSumAvg : {"sum":0.745,"avg":0.0324}
         */

        private String lastTime;
        private SevenSumAvgBean sevenSumAvg;
        private List<SevenDataListBean> sevenDataList;

        public String getLastTime() {
            return lastTime;
        }

        public void setLastTime(String lastTime) {
            this.lastTime = lastTime;
        }

        public SevenSumAvgBean getSevenSumAvg() {
            return sevenSumAvg;
        }

        public void setSevenSumAvg(SevenSumAvgBean sevenSumAvg) {
            this.sevenSumAvg = sevenSumAvg;
        }

        public List<SevenDataListBean> getSevenDataList() {
            return sevenDataList;
        }

        public void setSevenDataList(List<SevenDataListBean> sevenDataList) {
            this.sevenDataList = sevenDataList;
        }

        public static class SevenSumAvgBean implements Serializable {
            /**
             * sum : 0.745
             * avg : 0.0324
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

        public static class SevenDataListBean implements Serializable {
            /**
             * sum : 0.257
             * dayTime : 22-05-10
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
