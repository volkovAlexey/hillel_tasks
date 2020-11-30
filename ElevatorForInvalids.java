package com.school_hillel.task2_OOP;

public class ElevatorForInvalids extends ElevatorAbstract implements Elevator {

    ElevatorForInvalids(int floorNow, int maxWeight, int maxFloor) {
        super(floorNow, maxWeight, maxFloor);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        voiceToStart();
        if (floor > getMaxFloor()) {
            voiceWrongFloor();
            return false;
        }
        if (floor > getMinFloor()) {
            voiceWrongFloor();
            return false;
        }
        if (getFloorNow() == floor) {
            voiceSameFloor();
            return false;
        }
        if (weight >= getMaxWeight()) {
            voiceCrowded();
            return false;
        }
        voiceFinish();
        return true;
    }

    private void voiceToStart() {
        System.out.println("Attention, the doors are closing!");
    }

    private void voiceWrongFloor() {
        System.out.println("Please, enter the correct floor from" + getMinFloor() + " up to " + getMaxFloor());
    }

    private void voiceSameFloor() {
        System.out.println("Floors are the same");
    }

    private void voiceCrowded() {
        System.out.println("The elevator is crowded");
    }

    private void voiceFinish() {
        System.out.println("Attention, the doors are opening!");
    }
}
