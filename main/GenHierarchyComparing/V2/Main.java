package main.GenHierarchyComparing.V2;

public class Main {
    public static void main(String...args){
        One<String> one = new One<>("Hello");
        One<String> cast = new One<>("lala");
        Two<String,IllegalAccessError> two = new Two<>("My two", new IllegalAccessError());
        Three<String> three = (Three<String>)cast;



        if (one instanceof One<?>) System.out.println("ArgumentClass is instance of ArgumentClass");
        if (one instanceof Two<?,?>) System.out.println("ArgumentClass is instance of Two");
        if (two instanceof One<?>) System.out.println("Two is instance of ArgumentClass");
        if (two instanceof Two<?,?>) System.out.println("Two is instance of Two");



    }
}
