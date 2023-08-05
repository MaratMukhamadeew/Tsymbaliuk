package edu.cores.functionalInterface.sample3;

import java.util.NoSuchElementException;

@FunctionalInterface
public interface Generator<T> {
    T getNext();

    default void stopGenerator() {
        throw new NoSuchElementException();
    }

    @Override
    boolean equals(Object obj);
}
