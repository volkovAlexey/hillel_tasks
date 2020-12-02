package com.school_hillel.task3;

public class Manager extends Employee {
    private int[] subordinateId;

    public Manager(String name, String surName) {
        super(name, surName);
    }

    public Manager(String name, String surName, Integer salary) {
        super(name, surName, salary);
    }

    public int[] getSubordinateId() {
        return subordinateId;
    }

    public void setSubordinateId(int[] subordinateId) {
        this.subordinateId = subordinateId;
    }
}
