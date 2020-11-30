package com.school_hillel.task2_OOP;

public interface Elevator {

    int getMaxWeight();

    double getSpeed();

    boolean moveToFloor(int floor, int weight);
}
