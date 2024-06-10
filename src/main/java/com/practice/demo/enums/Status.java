package com.practice.demo.enums;

public enum Status {
    ACTIVE("active"),
    INACTIVE("inactive");

    public final String label;

    private Status(String label) {
        this.label = label;
    }
}
