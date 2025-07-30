package main.GenInterfaces.V4;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
