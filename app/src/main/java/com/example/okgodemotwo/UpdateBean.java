package com.example.okgodemotwo;


        import java.io.Serializable;

public class UpdateBean {
    /**
     * code : 200
     * data : {"equipmentId":"zcz00110011","equipmentState":1,"userId":"minApp113988","productId":"zcz001","equipmentName":"开关3","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1647229839340"}
     * message : 数据操作成功
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
         * equipmentId : zcz00110011
         * equipmentState : 1
         * userId : minApp113988
         * productId : zcz001
         * equipmentName : 开关3
         * equipmentRoom : 客厅
         * equipmentButName : 按键一
         * equipmentButState : 0
         * equipmentType : WIFI
         * productVersion : 1.0.0
         * equipmentVersion : 1.0.0
         * operateTime : 1647229839340
         */

        private String equipmentId;
        private int equipmentState;
        private String userId;
        private String productId;
        private String equipmentName;
        private String equipmentRoom;
        private String equipmentButName;
        private String equipmentButState;
        private String equipmentType;
        private String productVersion;
        private String equipmentVersion;
        private String operateTime;

        public String getEquipmentId() {
            return equipmentId;
        }

        public void setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
        }

        public int getEquipmentState() {
            return equipmentState;
        }

        public void setEquipmentState(int equipmentState) {
            this.equipmentState = equipmentState;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getEquipmentName() {
            return equipmentName;
        }

        public void setEquipmentName(String equipmentName) {
            this.equipmentName = equipmentName;
        }

        public String getEquipmentRoom() {
            return equipmentRoom;
        }

        public void setEquipmentRoom(String equipmentRoom) {
            this.equipmentRoom = equipmentRoom;
        }

        public String getEquipmentButName() {
            return equipmentButName;
        }

        public void setEquipmentButName(String equipmentButName) {
            this.equipmentButName = equipmentButName;
        }

        public String getEquipmentButState() {
            return equipmentButState;
        }

        public void setEquipmentButState(String equipmentButState) {
            this.equipmentButState = equipmentButState;
        }

        public String getEquipmentType() {
            return equipmentType;
        }

        public void setEquipmentType(String equipmentType) {
            this.equipmentType = equipmentType;
        }

        public String getProductVersion() {
            return productVersion;
        }

        public void setProductVersion(String productVersion) {
            this.productVersion = productVersion;
        }

        public String getEquipmentVersion() {
            return equipmentVersion;
        }

        public void setEquipmentVersion(String equipmentVersion) {
            this.equipmentVersion = equipmentVersion;
        }

        public String getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }
    }
}
