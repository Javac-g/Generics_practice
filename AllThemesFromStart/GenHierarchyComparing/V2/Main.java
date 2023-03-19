package AllThemesFromStart.GenHierarchyComparing.V2;

public class Main {
    public static void main(String...args){
        One<String> one = new One<>("Hello");
        Two<String,IllegalAccessError> two = new Two<>("My two", new IllegalAccessError());

        if (one instanceof One<?>) System.out.println("One is instance of One");
        if (one instanceof Two<?,?>) System.out.println("One is instance of Two");
        if (two instanceof One<?>) System.out.println("Two is instance of One");
        if (two instanceof Two<?,?>) System.out.println("Two is instance of Two");



    }
}
