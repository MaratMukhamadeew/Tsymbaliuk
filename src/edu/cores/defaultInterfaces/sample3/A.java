package edu.cores.defaultInterfaces.sample3;

public interface A {
    default String getMessage() {
        return "Hello World";
    }
}
