package edu.cores.lambda.sample5;

@FunctionalInterface
public interface Modifier<T> {
    T modification(T element);
}
