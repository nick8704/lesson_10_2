package com.company;

import java.util.Random;

public class SecondClass {

    private static int[] array = new int[100];

    static {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int[] getArray() {
        return array;
    }
}