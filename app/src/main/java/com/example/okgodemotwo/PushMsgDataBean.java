package com.example.okgodemotwo;



public class PushMsgDataBean {
    /**
     * platform : android
     * accountId : minApp113043
     * sound : default
     * type : alert
     * status : true
     * messageType : share
     * messageContent : {"msg":"请求授权信息","model":"accountShare"}
     */

    private String platform;
    private String accountId;
    private String sound;
    private String type;
    private boolean status;
    private String messageType;
    private String messageContent;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}
