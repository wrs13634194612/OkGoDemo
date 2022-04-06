package com.example.okgodemotwo;



        import java.util.List;
        import java.io.Serializable;

public class DeviceDataBean {
    /**
     * code : 200
     * data : [{"equipmentId":"zcz002103910","equipmentState":1,"userId":"minApp113988","productId":"zcz002","productName":"一氧化碳(co)","equipmentNote":"一氧化碳(co)","equipmentRoom":"客厅","equipmentIndex":"1","butNames":"按键一","isOn":"0","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","share":0,"operateTime":"1649209874583"},{"equipmentId":"zcz001101027","equipmentState":2,"userId":"minApp113043","productId":"zcz001","productName":"智能插座","equipmentNote":"智能插座","equipmentRoom":"客厅","equipmentIndex":"1","butNames":"","isOn":"1","equipmentType":"WIFI","productVersion":"2.0.10","equipmentVersion":"1.0.0","share":1,"operateTime":"1649209874583"}]
     * message : 查询成功
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * equipmentId : zcz002103910
         * equipmentState : 1
         * userId : minApp113988
         * productId : zcz002
         * productName : 一氧化碳(co)
         * equipmentNote : 一氧化碳(co)
         * equipmentRoom : 客厅
         * equipmentIndex : 1
         * butNames : 按键一
         * isOn : 0
         * equipmentType : WIFI
         * productVersion : 1.0.0
         * equipmentVersion : 1.0.0
         * share : 0
         * operateTime : 1649209874583
         */

        private String equipmentId;
        private int equipmentState;
        private String userId;
        private String productId;
        private String productName;
        private String equipmentNote;
        private String equipmentRoom;
        private String equipmentIndex;
        private String butNames;
        private String isOn;
        private String equipmentType;
        private String productVersion;
        private String equipmentVersion;
        private int share;
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

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getEquipmentNote() {
            return equipmentNote;
        }

        public void setEquipmentNote(String equipmentNote) {
            this.equipmentNote = equipmentNote;
        }

        public String getEquipmentRoom() {
            return equipmentRoom;
        }

        public void setEquipmentRoom(String equipmentRoom) {
            this.equipmentRoom = equipmentRoom;
        }

        public String getEquipmentIndex() {
            return equipmentIndex;
        }

        public void setEquipmentIndex(String equipmentIndex) {
            this.equipmentIndex = equipmentIndex;
        }

        public String getButNames() {
            return butNames;
        }

        public void setButNames(String butNames) {
            this.butNames = butNames;
        }

        public String getIsOn() {
            return isOn;
        }

        public void setIsOn(String isOn) {
            this.isOn = isOn;
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

        public int getShare() {
            return share;
        }

        public void setShare(int share) {
            this.share = share;
        }

        public String getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }
    }
}
