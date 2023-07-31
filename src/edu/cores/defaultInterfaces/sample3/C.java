package edu.cores.defaultInterfaces.sample3;

public class C extends RealizationA implements A, B {
    private String text;

    public C(String text) {
        super();
        this.text = text;
    }
    @Override
    public String toString() {
        return "C [text = " + text + "]";
    }
}

