package com.example.okgodemotwo;


public class ShareUserInfoBean {
    /**
     * msg : 你的好友用户：null向您分享了1个设备,点击确认
     * equipments : [{"equipmentNote":"智能插座","productId":"zcz001","equipmentId":"zcz001101027"}]
     * messageId : a7f0fb9ddb0c4f6fb3b56be6b114
     * model : accountShare
     * shareId : minApp113988
     * id : 133.0
     */

    private String msg;
    private String equipments;
    private String messageId;
    private String model;
    private String shareId;
    private double id;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEquipments() {
        return equipments;
    }

    public void setEquipments(String equipments) {
        this.equipments = equipments;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
