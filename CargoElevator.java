package com.school_hillel.task2_OOP;

public class CargoElevator extends ElevatorAbstract implements Elevator {

    CargoElevator(int floorNow, int maxWeight, int maxFloor) {
        super(floorNow, maxWeight, maxFloor);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        System.out.println("Please, press the button 'Close door'");
        if (pressButton()) {
            if (floor > getMaxFloor()) {
                System.out.println("Please, enter the correct floor from" + getMinFloor() + " up to " + getMaxFloor());
                return false;
            }
            if (floor > getMinFloor()) {
                System.out.println("Please, enter the correct floor from" + getMinFloor() + " up to " + getMaxFloor());
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
        return false;
    }

    private boolean pressButton() {
        // input data from users
        return true;
    }
}
