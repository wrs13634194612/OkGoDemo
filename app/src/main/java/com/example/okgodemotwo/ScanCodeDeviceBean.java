package com.example.okgodemotwo;



        import java.io.Serializable;

public class ScanCodeDeviceBean implements Serializable {
    /**
     * equipmentId : zcz002103910
     * equipmentNote : 一氧化碳(co)
     * productId : zcz002
     */

    private String equipmentId;
    private String equipmentNote;
    private String productId;

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentNote() {
        return equipmentNote;
    }

    public void setEquipmentNote(String equipmentNote) {
        this.equipmentNote = equipmentNote;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
