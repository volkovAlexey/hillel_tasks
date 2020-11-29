package com.school_hillel.task1;

public class Cycle {
    void printNotMultipleWithFor() {
        int multiple = 3;
        for (int i = 30; i >= 0; i--) {
            if (i % multiple > 0)
                System.out.println(i);
        }
    }

    void printNotMultipleWithWhile() {
        int multiple = 3;
        int i = 30;
        while (i >= 0) {
            if (i % multiple > 0)
                System.out.println(i);
            i--;
        }
    }

    void printNotMultipleWithDoWhile() {
        int multiple = 3;
        int i = 30;
        if (i >= 0) {
            do {
                if (i % multiple > 0)
                    System.out.println(i);
                i--;
            } while (i >= 0);
        }
    }
}
