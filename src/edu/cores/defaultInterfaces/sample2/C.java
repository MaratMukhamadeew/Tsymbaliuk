package edu.cores.defaultInterfaces.sample2;

public class C extends RealizationA implements B {
    private String text;

    public C(String text) {
        super(text);
        this.text = text;
    }

    @Override
    public String toString() {
        return "C [text = " + text + "]";
    }
}
