package edu.cores.lambda.sample6;

import java.io.FileNotFoundException;
import java.io.IOException;

@FunctionalInterface
public interface Saver {
    void save(Object obj) throws FileNotFoundException;
}
