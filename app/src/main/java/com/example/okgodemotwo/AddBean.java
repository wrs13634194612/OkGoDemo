package com.example.okgodemotwo;



        import java.io.Serializable;

public class AddBean {
    /**
     * code : 200
     * data : {"deviceButNames":"按键一,按键二","deviceRooms":"客厅,主卧,餐厅,厨房,次卧","deviceName":"零火线(二)"}
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
         * deviceButNames : 按键一,按键二
         * deviceRooms : 客厅,主卧,餐厅,厨房,次卧
         * deviceName : 零火线(二)
         */

        private String deviceButNames;
        private String deviceRooms;
        private String deviceName;

        public String getDeviceButNames() {
            return deviceButNames;
        }

        public void setDeviceButNames(String deviceButNames) {
            this.deviceButNames = deviceButNames;
        }

        public String getDeviceRooms() {
            return deviceRooms;
        }

        public void setDeviceRooms(String deviceRooms) {
            this.deviceRooms = deviceRooms;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }
    }
}

