package com.school_hillel.task3;

public class Employee {
    private static int classId;
    private int id;
    private String name;
    private String surName;
    private Integer salary;

    public Employee(String name, String surName) {
        this.id = classId++;
        this.name = name;
        this.surName = surName;
    }

    public Employee(String name, String surName, Integer salary) {
        this(name, surName);
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
