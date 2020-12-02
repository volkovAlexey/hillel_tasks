package com.school_hillel.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("ss", "ww");
        Employee employee1 = new Employee("qq", "ee");
        Employee employee3 = new Employee("ee", "dd");

        Manager manager = new Manager("aa", "cc", 123);
        int[] employees = new int[2];
        employees[0] = employee.getId();
        employees[1] = employee1.getId();
        manager.setSubordinateId(employees);

        Manager manager1 = new Manager("a1a", "c2c", 310);
        int[] employees1 = new int[1];
        employees1[0] = employee3.getId();
        manager1.setSubordinateId(employees1);

        System.out.println(Arrays.toString(employees));
        System.out.println(Arrays.toString(employees1));
    }
}
