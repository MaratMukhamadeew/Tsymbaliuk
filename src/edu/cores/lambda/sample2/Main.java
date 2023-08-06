package edu.cores.lambda.sample2;

public class Main {
    public static void main(String[] args) {
        SimpleClass sc = new SimpleClass(new int[] { 1, 2, 3, 4, 5 });

        Summator sm = sc.getSummatorInstance();

        Summator sm2 = () -> 55;
        System.out.println(sm.getSum());
        System.out.println(sm2.getSum());
    }
}
