package com.example.okgodemotwo;


public class ElectricityUpdateSendBean {
    /**
     * equipmentId : swt003vdee3f
     * status : 0
     * delay : 10
     * standbyPower : 15
     */

    private String equipmentId;
    private int status;
    private int delay;
    private int standbyPower;

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getStandbyPower() {
        return standbyPower;
    }

    public void setStandbyPower(int standbyPower) {
        this.standbyPower = standbyPower;
    }
}
