package AllThemesFromStart.GenHierarchyComparing.V3;

public class Main {
    public static void main(String... args) {
        One<Integer> one = new One<>(123);
        Two<Integer> two = new Two<>(321);
        Two<Float> three = new Two<Float>(421.5F);

        if (one instanceof One<?>) System.out.println("One - one: " +  true);
        if (one instanceof Two<?>) System.out.println("Two - one: " +  true);
        if (two instanceof One<?>) System.out.println("One - two: " +  true);
        if (two instanceof Two<?>) System.out.println("Two - two: " +  true);
        if (three instanceof One<?>) System.out.println("One - three: " +  true);
        if (three instanceof Two<?>) System.out.println("Two - three: " +  true);
    }
}
