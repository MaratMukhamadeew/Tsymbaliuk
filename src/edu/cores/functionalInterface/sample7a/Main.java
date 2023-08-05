package edu.cores.functionalInterface.sample7a;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generator gen = ArrayList::new;
        Object obj = gen.createNewObject();
        System.out.println(obj.getClass());
    }
}
