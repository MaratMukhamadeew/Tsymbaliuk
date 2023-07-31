package edu.cores.defaultInterfaces.sample1;

public interface A {
    default String getMessage() {
        return "Hello World";
    }
}
