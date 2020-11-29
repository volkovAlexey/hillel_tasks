package com.school_hillel.task1;

public class Concatenate {

    public String concat(String[] strings) {
        StringBuilder concatArray = new StringBuilder("");
        for (int i = 0; i < strings.length; i++) {
            if (i < strings.length - 1) {
                concatArray.append(strings[i] + "|");
            } else {
                concatArray.append(strings[i]);
            }
        }
        return concatArray.toString();
    }
}
