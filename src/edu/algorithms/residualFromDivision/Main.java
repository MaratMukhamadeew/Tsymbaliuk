package edu.algorithms.residualFromDivision;

public class Main {
    public static void main(String[] args) {
        System.out.println(5 % 2);
        System.out.println(5 % -2);
        System.out.println(-5 % -2);
        System.out.println(-5 % 2);

        System.out.println(ResidualFromDivision.mod(-5,-2));
        System.out.println(ResidualFromDivision.mod(-5,2));
    }
}
