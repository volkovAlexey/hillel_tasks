package com.school_hillel.task2_OOP;

public class PassElevator extends ElevatorAbstract implements Elevator {

    PassElevator(int floorNow, int maxWeight, int maxFloor) {
        super(floorNow, maxWeight, maxFloor);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (floor > getMaxFloor()) {
            System.out.println("Please, enter the correct floor from");
            return false;
        }
        if (floor > getMinFloor()) {
            System.out.println("Please, enter the correct floor from");
            return false;
        }
        if (getFloorNow() == floor) {
            System.out.println("Floors are the same");
            return false;
        }
        if (weight >= getMaxWeight()) {
            System.out.println("The elevator is crowded");
            return false;
        }
        return true;
    }
}
