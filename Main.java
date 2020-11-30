package com.school_hillel.task2_OOP;

public class Main {
    public static void main(String[] args) {
        Elevator passElevator = new PassElevator(2, 300, 9);
        Elevator cargoElevator = new CargoElevator(3, 500, 16);
        Elevator forInvalids = new ElevatorForInvalids(5, 100, 16);

        Elevator [] elevators = {passElevator, cargoElevator, forInvalids};

        elevators[0].moveToFloor(-3, 150);
        elevators[1].moveToFloor(9999, 150);
        elevators[2].moveToFloor(8, 150);
        elevators[1].moveToFloor(1, 150);

    }
}
