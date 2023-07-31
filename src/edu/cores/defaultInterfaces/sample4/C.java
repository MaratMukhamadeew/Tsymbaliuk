package edu.cores.defaultInterfaces.sample4;

public class C implements A, B {
    private String text;

    public C(String text) {
        super();
        this.text = text;
    }

    @Override
    public String getMessage() {
        return A.super.getMessage();
    }

    @Override
    public String toString() {
        return "C [text = " + text + "]";
    }
}

