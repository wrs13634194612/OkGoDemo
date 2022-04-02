package com.example.okgodemotwo;


        import java.io.Serializable;
        import java.util.List;

public class ShareReceiveBean {
    /**
     * code : 200
     * data : {"owners":[{"devices":[],"share":{"nickName":"1","headPortrait":"https://thirdwx.qlogo.cn/mmopen/vi_32/Ih0t4ACgYJqvlicJe4NZUia6qfo2jGrK1rhzy4fBKteBuItlqG0KC7ztbwSgZo56Yibw7Bne4MfaepwoCX34uBqjA/132","userId":"minApp113043"},"id":6}],"gives":[]}
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
        private List<OwnersBean> owners;
        private List<?> gives;

        public List<OwnersBean> getOwners() {
            return owners;
        }

        public void setOwners(List<OwnersBean> owners) {
            this.owners = owners;
        }

        public List<?> getGives() {
            return gives;
        }

        public void setGives(List<?> gives) {
            this.gives = gives;
        }

        public static class OwnersBean implements Serializable {
            /**
             * devices : []
             * share : {"nickName":"1","headPortrait":"https://thirdwx.qlogo.cn/mmopen/vi_32/Ih0t4ACgYJqvlicJe4NZUia6qfo2jGrK1rhzy4fBKteBuItlqG0KC7ztbwSgZo56Yibw7Bne4MfaepwoCX34uBqjA/132","userId":"minApp113043"}
             * id : 6
             */

            private ShareBean share;
            private int id;
            private List<?> devices;

            public ShareBean getShare() {
                return share;
            }

            public void setShare(ShareBean share) {
                this.share = share;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public List<?> getDevices() {
                return devices;
            }

            public void setDevices(List<?> devices) {
                this.devices = devices;
            }

            public static class ShareBean implements Serializable {
                /**
                 * nickName : 1
                 * headPortrait : https://thirdwx.qlogo.cn/mmopen/vi_32/Ih0t4ACgYJqvlicJe4NZUia6qfo2jGrK1rhzy4fBKteBuItlqG0KC7ztbwSgZo56Yibw7Bne4MfaepwoCX34uBqjA/132
                 * userId : minApp113043
                 */

                private String nickName;
                private String headPortrait;
                private String userId;

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getHeadPortrait() {
                    return headPortrait;
                }

                public void setHeadPortrait(String headPortrait) {
                    this.headPortrait = headPortrait;
                }

                public String getUserId() {
                    return userId;
                }

                public void setUserId(String userId) {
                    this.userId = userId;
                }
            }
        }
    }
}
