package com.example.okgodemotwo;




        import java.util.List;
        import java.io.Serializable;

public class RoomNumBean {
    /**
     * code : 200
     * data : [{"roomState":0,"list":[{"equipmentId":"2876669","equipmentState":1,"userId":"minApp113043","productId":"GWD001","equipmentName":"最新网关","equipmentRoom":"客厅","equipmentButName":"","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.47","equipmentVersion":"1.0.0","operateTime":"1650422763393"},{"equipmentId":"2876907","equipmentState":1,"userId":"minApp113043","productId":"GWD001","equipmentName":"WIFI/BL1网关","equipmentRoom":"客厅","equipmentButName":"","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.46","equipmentVersion":"1.0.0","operateTime":"1650348008805"},{"equipmentId":"3c6105d076c1","equipmentState":2,"userId":"minApp113043","productId":"swt002","equipmentName":"零火线(二)","equipmentRoom":"客厅","equipmentButName":"我在这里吃饭,按键二","equipmentButState":"0,0","equipmentIndex":"1,2","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1650446680138"},{"equipmentId":"3c6105d12dc5","equipmentState":1,"userId":"minApp113043","productId":"swt003","equipmentName":"零火线(三)","equipmentRoom":"客厅","equipmentButName":"按键一,按键二,按键三","equipmentButState":"0,0,1","equipmentIndex":"1,2,3","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1650248533454"},{"equipmentId":"zcz001101027","equipmentState":1,"userId":"minApp113043","productId":"zcz001","equipmentName":"智能插座","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.13","equipmentVersion":"1.0.0","operateTime":"1649208733588"},{"equipmentId":"zcz002105405","equipmentState":2,"userId":"minApp113043","productId":"zcz002","equipmentName":"一氧化碳(co)","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.13","equipmentVersion":"1.0.0","operateTime":"1650249405733"},{"equipmentId":"zcz004100145","equipmentState":1,"userId":"minApp113043","productId":"zcz004","equipmentName":"红外遥控","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.11","equipmentVersion":"1.0.0","operateTime":"1650248904855"}],"roomName":"客厅"},{"roomState":0,"list":[],"roomName":"主卧"},{"roomState":0,"list":[],"roomName":"次卧"},{"roomState":0,"list":[],"roomName":"厨房"},{"roomState":0,"list":[],"roomName":"阳台"},{"roomState":0,"list":[{"equipmentId":"","equipmentState":2,"userId":"minApp113043","productId":"","equipmentName":"16A插座","equipmentRoom":"洗手间","equipmentButName":"","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1650504144017"},{"equipmentId":"3c6105d2dd35","equipmentState":1,"userId":"minApp113043","productId":"HPS001","equipmentName":"16A插座","equipmentRoom":"洗手间","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.51","equipmentVersion":"1.0.0","operateTime":"1648864939621"}],"roomName":"洗手间"},{"roomState":0,"list":[],"roomName":"工作间"},{"roomState":0,"list":[],"roomName":"我在这里等着我呢"}]
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
         * roomState : 0
         * list : [{"equipmentId":"2876669","equipmentState":1,"userId":"minApp113043","productId":"GWD001","equipmentName":"最新网关","equipmentRoom":"客厅","equipmentButName":"","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.47","equipmentVersion":"1.0.0","operateTime":"1650422763393"},{"equipmentId":"2876907","equipmentState":1,"userId":"minApp113043","productId":"GWD001","equipmentName":"WIFI/BL1网关","equipmentRoom":"客厅","equipmentButName":"","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"1.0.46","equipmentVersion":"1.0.0","operateTime":"1650348008805"},{"equipmentId":"3c6105d076c1","equipmentState":2,"userId":"minApp113043","productId":"swt002","equipmentName":"零火线(二)","equipmentRoom":"客厅","equipmentButName":"我在这里吃饭,按键二","equipmentButState":"0,0","equipmentIndex":"1,2","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1650446680138"},{"equipmentId":"3c6105d12dc5","equipmentState":1,"userId":"minApp113043","productId":"swt003","equipmentName":"零火线(三)","equipmentRoom":"客厅","equipmentButName":"按键一,按键二,按键三","equipmentButState":"0,0,1","equipmentIndex":"1,2,3","equipmentType":"WIFI","productVersion":"1.0.0","equipmentVersion":"1.0.0","operateTime":"1650248533454"},{"equipmentId":"zcz001101027","equipmentState":1,"userId":"minApp113043","productId":"zcz001","equipmentName":"智能插座","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.13","equipmentVersion":"1.0.0","operateTime":"1649208733588"},{"equipmentId":"zcz002105405","equipmentState":2,"userId":"minApp113043","productId":"zcz002","equipmentName":"一氧化碳(co)","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.13","equipmentVersion":"1.0.0","operateTime":"1650249405733"},{"equipmentId":"zcz004100145","equipmentState":1,"userId":"minApp113043","productId":"zcz004","equipmentName":"红外遥控","equipmentRoom":"客厅","equipmentButName":"按键一","equipmentButState":"0","equipmentIndex":"1","equipmentType":"WIFI","productVersion":"2.0.11","equipmentVersion":"1.0.0","operateTime":"1650248904855"}]
         * roomName : 客厅
         */

        private int roomState;
        private String roomName;
        private List<ListBean> list;

        public int getRoomState() {
            return roomState;
        }

        public void setRoomState(int roomState) {
            this.roomState = roomState;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean implements Serializable {
            /**
             * equipmentId : 2876669
             * equipmentState : 1
             * userId : minApp113043
             * productId : GWD001
             * equipmentName : 最新网关
             * equipmentRoom : 客厅
             * equipmentButName :
             * equipmentButState : 0
             * equipmentIndex : 1
             * equipmentType : WIFI
             * productVersion : 1.0.47
             * equipmentVersion : 1.0.0
             * operateTime : 1650422763393
             */

            private String equipmentId;
            private int equipmentState;
            private String userId;
            private String productId;
            private String equipmentName;
            private String equipmentRoom;
            private String equipmentButName;
            private String equipmentButState;
            private String equipmentIndex;
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

            public String getEquipmentIndex() {
                return equipmentIndex;
            }

            public void setEquipmentIndex(String equipmentIndex) {
                this.equipmentIndex = equipmentIndex;
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
}
