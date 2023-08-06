package edu.cores.lambda.sample5;

public class Main {
    public static void main(String[] args) {
        Modifier<String> mod = (text) -> text.toUpperCase();

        System.out.println(mod.modification("hello"));
    }
}
