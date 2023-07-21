package edu.cores.inner;

public class Main {
    public static void main(String[] args) {

        Letter letter = new Letter("Marat");
        Letter.Address address = letter.new Address(1);

        Letter.Address address1 = new Letter("Maxim").new Address(2);

        System.out.println(address.getLetterSender());
        System.out.println(address1.getLetterSender());
        System.out.println(address);
        System.out.println(address1);

        MathFunction mf = new MathFunction();

        System.out.println(calculate(mf.getSquare(), 1, 4));
        System.out.println(calculate(mf.getCube(), 1, 4));

        StringWrapper sw = new StringWrapper("Hello");

        for (Character ch : sw) {
            System.out.println(ch);
            for (Character d : sw) {
                System.out.print(d);
            }
            System.out.println();
        }

        Outer outer = new Outer(11);
        InnerSubclass innerSubclass = new InnerSubclass(outer, "name");

        System.out.println(innerSubclass.getTotalInfo());

    }

    public static int calculate(Function function, int begin, int end) {
        return function.calculate(begin, end);
    }
}
