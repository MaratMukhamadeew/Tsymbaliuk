package edu.cores.privateMethodsInterfaceses.sample2;

public class Cat {
    private String name;
    private int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat name [" + name + "], weight [" + weight + "]";
    }
}
