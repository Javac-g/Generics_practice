package main.GenInterfaces.V3;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
