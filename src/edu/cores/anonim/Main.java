package edu.cores.anonim;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska");
        System.out.println(cat1);
        System.out.println(cat1.getVoice());

        Cat cat2 = new Cat("Goga") {
            @Override
            public String getVoice() {
                return "woof";
            }
        };

        System.out.println(cat2);
        System.out.println(cat2.getVoice());
    }
}

class Cat {
    private String name;

    public Cat() {
        super();
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat [name = " + name + "]";
    }
}

