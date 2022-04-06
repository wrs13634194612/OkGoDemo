package com.example.okgodemotwo;


import java.util.List;
import java.io.Serializable;

public class AddProductBean {
    /**
     * code : 200
     * data : {"butNames":"按键一","equipmentNote":"一氧化碳(co)","equipmentRoom":"客厅","equipmentLabel":"客厅,主卧,次卧,卧室,厨房,阳台,洗手间,工作间"}
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
         * butNames : 按键一
         * equipmentNote : 一氧化碳(co)
         * equipmentRoom : 客厅
         * equipmentLabel : 客厅,主卧,次卧,卧室,厨房,阳台,洗手间,工作间
         */

        private String butNames;
        private String equipmentNote;
        private String equipmentRoom;
        private String equipmentLabel;

        public String getButNames() {
            return butNames;
        }

        public void setButNames(String butNames) {
            this.butNames = butNames;
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

        public String getEquipmentLabel() {
            return equipmentLabel;
        }

        public void setEquipmentLabel(String equipmentLabel) {
            this.equipmentLabel = equipmentLabel;
        }
    }
}
