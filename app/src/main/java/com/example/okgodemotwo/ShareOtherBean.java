package com.example.okgodemotwo;



        import java.io.Serializable;

public class ShareOtherBean {
    /**
     * badge : 1
     * alert : {"title":"分享消息","body":"你的好友1向你分享1台设备"}
     * sound : default
     * userinfo : {"msg":"你的好友用户：null向您分享了1个设备,点击确认","equipments":"[{\"equipmentNote\":\"智能插座\",\"productId\":\"zcz001\",\"equipmentId\":\"zcz001101027\"}]","messageId":"a7f0fb9ddb0c4f6fb3b56be6b114","model":"accountShare","shareId":"minApp113988","id":133.0}
     */

    private int badge;
    private AlertBean alert;
    private String sound;
    private String userinfo;

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public AlertBean getAlert() {
        return alert;
    }

    public void setAlert(AlertBean alert) {
        this.alert = alert;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo;
    }

    public static class AlertBean implements Serializable {
        /**
         * title : 分享消息
         * body : 你的好友1向你分享1台设备
         */

        private String title;
        private String body;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }




}
