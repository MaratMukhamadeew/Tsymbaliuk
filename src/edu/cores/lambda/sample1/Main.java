package edu.cores.lambda.sample1;

public class Main {
    public static void main(String[] args) {
        StringModifier sm = (text) -> text.toUpperCase();

        System.out.println(sm.getString("hello"));

        StringModifier sm2 = (text) -> {
            var result = "";
            for (char let : text.toCharArray()) {
                if (Character.isLetter(let) || let == ' ') {
                    result.concat(String.valueOf(let));
                }
            }
            return result;
        };

        System.out.println(sm2.getString("hello22 world,."));
    }
}
