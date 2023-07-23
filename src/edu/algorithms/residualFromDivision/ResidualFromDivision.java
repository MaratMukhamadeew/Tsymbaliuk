package edu.algorithms.residualFromDivision;

/**
 * Реализация метода для согласованного вычисления остатка от деления
 * */

public class ResidualFromDivision {
    public static int mod(int a, int b) {
        if (a > 0 && b > 0) {
            return a % b;
        } else if (a > 0 && b < 0) {
            return a % b;
        } else if (a < 0 && b < 0) {
            return a - (a / b +1 ) * b;
        } else {
            return a - (a / b - 1) * b;
        }
    }
}
