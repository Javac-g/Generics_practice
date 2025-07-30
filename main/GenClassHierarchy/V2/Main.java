package main.GenClassHierarchy.V2;

public class Main {
    public static  void main(String...args){
        Two<Integer> first = new Two<>(1234);
        Two<String> second = new Two<>("HW");
        //
        One<Integer> iob = new One<>(123);
        Two<Integer> iob2 = new Two<>(321);
        Two<String> strOb2 = new Two<>("hello");

        if (iob2  instanceof  Two<?>) System.out.println("Iob2: Two" );
        if (iob2 instanceof One<?>)System.out.println("Iob2: One");

        if (iob instanceof Two<?>)System.out.println("Iob: Two");
        if (iob instanceof One<?>)System.out.println("Iob One");

        if (strOb2 instanceof Two<?>)System.out.println("strOb2: Two");
        if (strOb2 instanceof One<?>)System.out.println("strOb2 One");



        iob.showType();
        iob2.showType();
        strOb2.showType();

    }
}
