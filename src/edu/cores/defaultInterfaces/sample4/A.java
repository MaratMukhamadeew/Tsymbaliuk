package edu.cores.defaultInterfaces.sample4;

public interface A {
    default String getMessage() {
        return "Hello World";
    }
}
