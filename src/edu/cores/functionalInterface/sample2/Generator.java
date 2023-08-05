package edu.cores.functionalInterface.sample2;

import java.util.NoSuchElementException;

@FunctionalInterface
public interface Generator<T> {
    T getNext();

    default void stopGenerator() {
        throw new NoSuchElementException();
    }
}
