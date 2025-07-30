package main.GenInterfaces.V2;

public interface MyInterface <T extends Comparable<T>>{
    T min();
    T max();
}
