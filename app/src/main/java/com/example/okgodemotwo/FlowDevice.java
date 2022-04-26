package com.example.okgodemotwo;

import java.io.Serializable;

public class FlowDevice implements Serializable {
    public String name;

    public boolean isCheck;

    public String getColor() {
        if (!isCheck) {
            return "#7F7F7F";
        }
        return "#FFFFFF";

    }

    public FlowDevice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FlowDevice{" +
                "name='" + name + '\'' +
                ", isCheck=" + isCheck +
                '}';
    }
}
