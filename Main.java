package com.school_hillel.task2_OOP;

public class Main {
    public static void main(String[] args) {
        Elevator passElevator = new PassElevator(2, 300, 9);
        Elevator cargoElevator = new CargoElevator(3, 500, 16);
        Elevator forInvalids = new ElevatorForInvalids(5, 100, 16);

        Elevator[] elevators = {passElevator, cargoElevator, forInvalids};

        for (Elevator temp : elevators) {
            temp.moveToFloor(-3, 120);
            temp.moveToFloor(9999, 150);
            temp.moveToFloor(8, 150);
            temp.moveToFloor(1, 100);
        }
    }
}
