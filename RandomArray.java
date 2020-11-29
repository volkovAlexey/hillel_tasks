package com.school_hillel.task1;

public class RandomArray {
    private int value = 5 + (int) (Math.random() * 10);
    private int array[] = new int[value];
    private int rand;

    public void printEvenArray() {
        for (int i = 0; i < array.length; i++) {
            rand = (int) (Math.random() * 100);
            if (rand % 2 == 0) {
                array[i] = rand;
                System.out.println(array[i]);
            } else {
                i--;
            }
        }
        findMax(array);
        findMin(array);
    }

    public void printOddArray() {
        for (int i = 0; i < array.length; i++) {
            rand = (int) (Math.random() * 100);
            if (rand % 2 > 0) {
                array[i] = rand;
                System.out.println(array[i]);
            } else {
                i--;
            }
        }
        findMax(array);
        findMin(array);
    }

    private void findMax(int[] array) {
        int max = array[0];
        for (int temp : array) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println("Max = " + max);
    }

    private void findMin(int[] array) {
        int min = array[0];
        for (int temp : array) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Min = " + min);
    }
}
