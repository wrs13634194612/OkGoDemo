package com.example.okgodemotwo;

import java.util.List;
import java.io.Serializable;

public class UpdateModelSendBean {

    /**
     * equipmentModelRepeat : 1,2,3,4,5,6,7
     * equipmentModelIcon : 1
     * equipmentModelName : 模式2
     * onOff : 1
     * endIf : 1
     * equipmentList : zcz002105405
     * equipmentModelId : model10742
     * equipmentModelBeginTime : 10:30:00
     * orderOnOff : 1
     * beginIf : 1
     * over : false
     * creationDate : 2022-04-06 15:31:10
     * stateList :
     * equipmentDatas : [{"equipmentType":"","isOn":"0","equipmentModelState":2,"share":0,"isSelected":false,"productId":"zcz002","equipmentVersion":"","productImage":"","equipmentLabel":"","productIcon":"http://112.74.48.180/wanYe/images/equipment/zczco.png","equipmentNote":"一氧化碳(co)","equipmentRoom":"","equipmentState":2,"indexs":"","isBleDevice":false,"productName":"一氧化碳(co)","butNames":"按键一","operateTime":"","equipmentName":"","productVersion":"","equipmentId":"zcz002105405"}]
     * equipmentModelEndTime : 11:30:00
     * userId : minApp114170
     */

    private String equipmentModelRepeat;
    private int equipmentModelIcon;
    private String equipmentModelName;
    private int onOff;
    private int endIf;
    private String equipmentList;
    private String equipmentModelId;
    private String equipmentModelBeginTime;
    private int orderOnOff;
    private int beginIf;
    private boolean over;
    private String creationDate;
    private String stateList;
    private String equipmentModelEndTime;
    private String userId;
    private List<EquipmentDatasBean> equipmentDatas;

    public String getEquipmentModelRepeat() {
        return equipmentModelRepeat;
    }

    public void setEquipmentModelRepeat(String equipmentModelRepeat) {
        this.equipmentModelRepeat = equipmentModelRepeat;
    }

    public int getEquipmentModelIcon() {
        return equipmentModelIcon;
    }

    public void setEquipmentModelIcon(int equipmentModelIcon) {
        this.equipmentModelIcon = equipmentModelIcon;
    }

    public String getEquipmentModelName() {
        return equipmentModelName;
    }

    public void setEquipmentModelName(String equipmentModelName) {
        this.equipmentModelName = equipmentModelName;
    }

    public int getOnOff() {
        return onOff;
    }

    public void setOnOff(int onOff) {
        this.onOff = onOff;
    }

    public int getEndIf() {
        return endIf;
    }

    public void setEndIf(int endIf) {
        this.endIf = endIf;
    }

    public String getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(String equipmentList) {
        this.equipmentList = equipmentList;
    }

    public String getEquipmentModelId() {
        return equipmentModelId;
    }

    public void setEquipmentModelId(String equipmentModelId) {
        this.equipmentModelId = equipmentModelId;
    }

    public String getEquipmentModelBeginTime() {
        return equipmentModelBeginTime;
    }

    public void setEquipmentModelBeginTime(String equipmentModelBeginTime) {
        this.equipmentModelBeginTime = equipmentModelBeginTime;
    }

    public int getOrderOnOff() {
        return orderOnOff;
    }

    public void setOrderOnOff(int orderOnOff) {
        this.orderOnOff = orderOnOff;
    }

    public int getBeginIf() {
        return beginIf;
    }

    public void setBeginIf(int beginIf) {
        this.beginIf = beginIf;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getStateList() {
        return stateList;
    }

    public void setStateList(String stateList) {
        this.stateList = stateList;
    }

    public String getEquipmentModelEndTime() {
        return equipmentModelEndTime;
    }

    public void setEquipmentModelEndTime(String equipmentModelEndTime) {
        this.equipmentModelEndTime = equipmentModelEndTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<EquipmentDatasBean> getEquipmentDatas() {
        return equipmentDatas;
    }

    public void setEquipmentDatas(List<EquipmentDatasBean> equipmentDatas) {
        this.equipmentDatas = equipmentDatas;
    }

    public static class EquipmentDatasBean implements Serializable {
        /**
         * equipmentType :
         * isOn : 0
         * equipmentModelState : 2
         * share : 0
         * isSelected : false
         * productId : zcz002
         * equipmentVersion :
         * productImage :
         * equipmentLabel :
         * productIcon : http://112.74.48.180/wanYe/images/equipment/zczco.png
         * equipmentNote : 一氧化碳(co)
         * equipmentRoom :
         * equipmentState : 2
         * indexs :
         * isBleDevice : false
         * productName : 一氧化碳(co)
         * butNames : 按键一
         * operateTime :
         * equipmentName :
         * productVersion :
         * equipmentId : zcz002105405
         */

        private String equipmentType;
        private String isOn;
        private int equipmentModelState;
        private int share;
        private boolean isSelected;
        private String productId;
        private String equipmentVersion;
        private String productImage;
        private String equipmentLabel;
        private String productIcon;
        private String equipmentNote;
        private String equipmentRoom;
        private int equipmentState;
        private String indexs;
        private boolean isBleDevice;
        private String productName;
        private String butNames;
        private String operateTime;
        private String equipmentName;
        private String productVersion;
        private String equipmentId;

        public String getEquipmentType() {
            return equipmentType;
        }

        public void setEquipmentType(String equipmentType) {
            this.equipmentType = equipmentType;
        }

        public String getIsOn() {
            return isOn;
        }

        public void setIsOn(String isOn) {
            this.isOn = isOn;
        }

        public int getEquipmentModelState() {
            return equipmentModelState;
        }

        public void setEquipmentModelState(int equipmentModelState) {
            this.equipmentModelState = equipmentModelState;
        }

        public int getShare() {
            return share;
        }

        public void setShare(int share) {
            this.share = share;
        }

        public boolean isIsSelected() {
            return isSelected;
        }

        public void setIsSelected(boolean isSelected) {
            this.isSelected = isSelected;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getEquipmentVersion() {
            return equipmentVersion;
        }

        public void setEquipmentVersion(String equipmentVersion) {
            this.equipmentVersion = equipmentVersion;
        }

        public String getProductImage() {
            return productImage;
        }

        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }

        public String getEquipmentLabel() {
            return equipmentLabel;
        }

        public void setEquipmentLabel(String equipmentLabel) {
            this.equipmentLabel = equipmentLabel;
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

        public String getEquipmentRoom() {
            return equipmentRoom;
        }

        public void setEquipmentRoom(String equipmentRoom) {
            this.equipmentRoom = equipmentRoom;
        }

        public int getEquipmentState() {
            return equipmentState;
        }

        public void setEquipmentState(int equipmentState) {
            this.equipmentState = equipmentState;
        }

        public String getIndexs() {
            return indexs;
        }

        public void setIndexs(String indexs) {
            this.indexs = indexs;
        }

        public boolean isIsBleDevice() {
            return isBleDevice;
        }

        public void setIsBleDevice(boolean isBleDevice) {
            this.isBleDevice = isBleDevice;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getButNames() {
            return butNames;
        }

        public void setButNames(String butNames) {
            this.butNames = butNames;
        }

        public String getOperateTime() {
            return operateTime;
        }

        public void setOperateTime(String operateTime) {
            this.operateTime = operateTime;
        }

        public String getEquipmentName() {
            return equipmentName;
        }

        public void setEquipmentName(String equipmentName) {
            this.equipmentName = equipmentName;
        }

        public String getProductVersion() {
            return productVersion;
        }

        public void setProductVersion(String productVersion) {
            this.productVersion = productVersion;
        }

        public String getEquipmentId() {
            return equipmentId;
        }

        public void setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
        }
    }
}
