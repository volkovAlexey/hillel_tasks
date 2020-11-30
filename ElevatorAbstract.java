package com.school_hillel.task2_OOP;

public abstract class ElevatorAbstract implements Elevator {
    private int maxFloor;
    private int minFloor;
    private int floorNow;
    private double speed = 5.4;
    private int maxWeight;

    ElevatorAbstract(int floorNow, int maxWeight, int maxFloor) {
        this.floorNow = floorNow;
        this.maxWeight = maxWeight;
        this.minFloor = -1;
        this.maxFloor = maxFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getFloorNow() {
        return floorNow;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }
}
