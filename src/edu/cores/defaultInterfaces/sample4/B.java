package edu.cores.defaultInterfaces.sample4;

public interface B {
    default String getMessage() {
        return "Hello Java";
    }
}
