package edu.cores.defaultInterfaces.sample3;

public interface B {
    default String getMessage() {
        return "Hello Java";
    }
}
