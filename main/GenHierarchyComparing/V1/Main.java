package main.GenHierarchyComparing.V1;

public class    Main {
    public static void main(String...args){
        One<Integer> A = new One<>(123);
        Two<Integer> B = new Two<>(321);
        Two<String> C = new Two<>("Hello");

        if (A instanceof Two<?> )System.out.println("A is instance of Two");
        if (A instanceof One<?>)System.out.println("A is instance of ArgumentClass");
        if (B instanceof Two<?> )System.out.println("B is instance of Two");
        if (B instanceof One<?>)System.out.println("B is instance of ArgumentClass");
        if (C instanceof Two<?> )System.out.println("C is instance of Two");
        if (C instanceof One<?>)System.out.println("C is instance of ArgumentClass");

    }
}
