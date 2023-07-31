package edu.cores.defaultInterfaces.sample2;

public interface B extends A {
    @Override
    default String getMessage() {
        return "Hello Java";
    }
}
