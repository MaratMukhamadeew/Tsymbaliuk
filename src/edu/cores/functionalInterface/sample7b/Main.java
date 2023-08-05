package edu.cores.functionalInterface.sample7b;

public class Main {
    public static void main(String[] args) {
        Generator gen = int[]::new;
        Object obj = gen.createNewObject(10);
        System.out.println(obj.getClass());
    }
}
