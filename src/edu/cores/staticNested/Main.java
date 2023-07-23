package edu.cores.staticNested;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass on = new OuterClass.NestedClass("Hello");
        on.printText();
        on.printText(new OuterClass("world"));
    }
}
