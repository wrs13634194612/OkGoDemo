package com.example.okgodemotwo;

public class PushMsgDetailBean {
    /**
     * msg : 你的好友用户：测试账号向您分享了4个设备,点击确认
     * equipments : [{"equipmentNote":"零火线(一)","productId":"swt001","equipmentId":"swt001100223"},{"equipmentNote":"零火线(二)","productId":"swt002","equipmentId":"swt002100326"}]
     * nickName : 测试账号
     * messageId : 899ab6f45fb643648644b9e8d56a
     * model : accountShare
     * shareId : minApp108881
     * id : 215
     */

    private String msg;
    private String equipments;
    private String nickName;
    private String messageId;
    private String model;
    private String shareId;
    private int id;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
