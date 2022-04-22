package com.example.okgodemotwo;


        import java.util.List;
        import java.io.Serializable;

public class UpdateModelBean {
    /**
     * code : 200
     * data : {"equipmentDatas":[{"equipmentId":"zcz002103910","isOn":"1","equipmentState":2,"productName":"一氧化碳(co)","productId":"zcz002","productIcon":"http://112.74.48.180/wanYe/images/equipment/zczco.png","equipmentNote":"一氧化碳(co)","equipmentModelState":1}],"equipmentModelRepeat":"7,1,2,3,4,5,6","over":"false","stateList":"zcz002103910","equipmentModelId":"model10730","creationDate":"","equipmentList":"zcz002103910","equipmentModelIcon":"1","equipmentModelBeginTime":"00:01","orderOnOff":"1","equipmentModelEndTime":"00:06","endIf":"1","equipmentModelName":"1","beginIf":"1","onOff":"1"}
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
         * equipmentDatas : [{"equipmentId":"zcz002103910","isOn":"1","equipmentState":2,"productName":"一氧化碳(co)","productId":"zcz002","productIcon":"http://112.74.48.180/wanYe/images/equipment/zczco.png","equipmentNote":"一氧化碳(co)","equipmentModelState":1}]
         * equipmentModelRepeat : 7,1,2,3,4,5,6
         * over : false
         * stateList : zcz002103910
         * equipmentModelId : model10730
         * creationDate :
         * equipmentList : zcz002103910
         * equipmentModelIcon : 1
         * equipmentModelBeginTime : 00:01
         * orderOnOff : 1
         * equipmentModelEndTime : 00:06
         * endIf : 1
         * equipmentModelName : 1
         * beginIf : 1
         * onOff : 1
         */

        private String equipmentModelRepeat;
        private String over;
        private String stateList;
        private String equipmentModelId;
        private String creationDate;
        private String equipmentList;
        private String equipmentModelIcon;
        private String equipmentModelBeginTime;
        private String orderOnOff;
        private String equipmentModelEndTime;
        private String endIf;
        private String equipmentModelName;
        private String beginIf;
        private String onOff;
        private List<EquipmentDatasBean> equipmentDatas;

        public String getEquipmentModelRepeat() {
            return equipmentModelRepeat;
        }

        public void setEquipmentModelRepeat(String equipmentModelRepeat) {
            this.equipmentModelRepeat = equipmentModelRepeat;
        }

        public String getOver() {
            return over;
        }

        public void setOver(String over) {
            this.over = over;
        }

        public String getStateList() {
            return stateList;
        }

        public void setStateList(String stateList) {
            this.stateList = stateList;
        }

        public String getEquipmentModelId() {
            return equipmentModelId;
        }

        public void setEquipmentModelId(String equipmentModelId) {
            this.equipmentModelId = equipmentModelId;
        }

        public String getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(String creationDate) {
            this.creationDate = creationDate;
        }

        public String getEquipmentList() {
            return equipmentList;
        }

        public void setEquipmentList(String equipmentList) {
            this.equipmentList = equipmentList;
        }

        public String getEquipmentModelIcon() {
            return equipmentModelIcon;
        }

        public void setEquipmentModelIcon(String equipmentModelIcon) {
            this.equipmentModelIcon = equipmentModelIcon;
        }

        public String getEquipmentModelBeginTime() {
            return equipmentModelBeginTime;
        }

        public void setEquipmentModelBeginTime(String equipmentModelBeginTime) {
            this.equipmentModelBeginTime = equipmentModelBeginTime;
        }

        public String getOrderOnOff() {
            return orderOnOff;
        }

        public void setOrderOnOff(String orderOnOff) {
            this.orderOnOff = orderOnOff;
        }

        public String getEquipmentModelEndTime() {
            return equipmentModelEndTime;
        }

        public void setEquipmentModelEndTime(String equipmentModelEndTime) {
            this.equipmentModelEndTime = equipmentModelEndTime;
        }

        public String getEndIf() {
            return endIf;
        }

        public void setEndIf(String endIf) {
            this.endIf = endIf;
        }

        public String getEquipmentModelName() {
            return equipmentModelName;
        }

        public void setEquipmentModelName(String equipmentModelName) {
            this.equipmentModelName = equipmentModelName;
        }

        public String getBeginIf() {
            return beginIf;
        }

        public void setBeginIf(String beginIf) {
            this.beginIf = beginIf;
        }

        public String getOnOff() {
            return onOff;
        }

        public void setOnOff(String onOff) {
            this.onOff = onOff;
        }

        public List<EquipmentDatasBean> getEquipmentDatas() {
            return equipmentDatas;
        }

        public void setEquipmentDatas(List<EquipmentDatasBean> equipmentDatas) {
            this.equipmentDatas = equipmentDatas;
        }

        public static class EquipmentDatasBean implements Serializable {
            /**
             * equipmentId : zcz002103910
             * isOn : 1
             * equipmentState : 2
             * productName : 一氧化碳(co)
             * productId : zcz002
             * productIcon : http://112.74.48.180/wanYe/images/equipment/zczco.png
             * equipmentNote : 一氧化碳(co)
             * equipmentModelState : 1
             */

            private String equipmentId;
            private String isOn;
            private int equipmentState;
            private String productName;
            private String productId;
            private String productIcon;
            private String equipmentNote;
            private int equipmentModelState;

            public String getEquipmentId() {
                return equipmentId;
            }

            public void setEquipmentId(String equipmentId) {
                this.equipmentId = equipmentId;
            }

            public String getIsOn() {
                return isOn;
            }

            public void setIsOn(String isOn) {
                this.isOn = isOn;
            }

            public int getEquipmentState() {
                return equipmentState;
            }

            public void setEquipmentState(int equipmentState) {
                this.equipmentState = equipmentState;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public String getProductIcon() {
                return productIcon;
            }

            public void setProductIcon(String productIcon) {
                this.productIcon = productIcon;
            }

            public String getEquipmentNote() {
                return equipmentNote;
            }

            public void setEquipmentNote(String equipmentNote) {
                this.equipmentNote = equipmentNote;
            }

            public int getEquipmentModelState() {
                return equipmentModelState;
            }

            public void setEquipmentModelState(int equipmentModelState) {
                this.equipmentModelState = equipmentModelState;
            }
        }
    }
}
