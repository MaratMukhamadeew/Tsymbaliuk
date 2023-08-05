package edu.cores.functionalInterface.sample8a;

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();

        IntElementGenerator ieg = gen::nextElement;
        System.out.println(ieg.next(55));
    }
}
