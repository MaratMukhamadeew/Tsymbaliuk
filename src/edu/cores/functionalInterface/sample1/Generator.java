package edu.cores.functionalInterface.sample1;

@FunctionalInterface
public interface Generator<T> {
    T getNext();
}
