package edu.cores.defaultInterfaces.sample1;

public interface B extends A{
    @Override
    default String getMessage() {
        return "Hello Java";
    }
}
