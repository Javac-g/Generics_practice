package main.GenInterfaces.V1;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
