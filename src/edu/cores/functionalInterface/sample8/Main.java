package edu.cores.functionalInterface.sample8;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();

        Modifier<Integer> a = ng::add;

        Modifier<String> b = ng::add;

        System.out.println(a.change(55));
        System.out.println(b.change("Hello"));
    }
}
