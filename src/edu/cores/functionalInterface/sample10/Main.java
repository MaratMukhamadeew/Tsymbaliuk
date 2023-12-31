package edu.cores.functionalInterface.sample10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[] { "hello", "World" };
        changeStringArray(array, String::toUpperCase);
        System.out.println(Arrays.toString(array));
    }

    public static void changeStringArray(String[] array, StringModificationFunction smf) {
        for (int i = 0; i < array.length; i++) {
            array[i] = smf.modification(array[i]);
        }
    }
}
