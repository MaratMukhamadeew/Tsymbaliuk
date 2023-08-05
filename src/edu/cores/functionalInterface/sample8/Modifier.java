package edu.cores.functionalInterface.sample8;

@FunctionalInterface
public interface Modifier<T> {
    T change(T obj);
}
