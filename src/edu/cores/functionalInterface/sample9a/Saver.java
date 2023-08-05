package edu.cores.functionalInterface.sample9a;

import java.io.IOException;

@FunctionalInterface
public interface Saver<T> {
    void saveTo(T element) throws IOException;
}
