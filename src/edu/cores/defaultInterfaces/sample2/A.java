package edu.cores.defaultInterfaces.sample2;

public interface A {
    default String getMessage() {
        return "Hello World";
    }
}
