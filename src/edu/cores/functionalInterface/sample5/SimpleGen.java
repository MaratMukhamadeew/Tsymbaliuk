package edu.cores.functionalInterface.sample5;

public class SimpleGen {
    private int number;

    public SimpleGen(int number) {
        super();
        this.number = number;
    }

    public SimpleGen() {
        super();
    }

    public int getNumber() {
        return number++;
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
