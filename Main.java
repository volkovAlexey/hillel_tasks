package com.school_hillel.task1;

public class Main {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.printNotMultipleWithFor();
        cycle.printNotMultipleWithWhile();
        cycle.printNotMultipleWithDoWhile();

        RandomArray randomArray = new RandomArray();
        randomArray.printEvenArray();
        randomArray.printOddArray();

        String[] strings = {"ss", "ww", "qq", "aa"};
        Concatenate concatenate = new Concatenate();
        System.out.println(concatenate.concat(strings));
    }
}
