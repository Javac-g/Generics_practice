package main.GenClassHierarchy.V4.GenSubClass;

public class Main {
    public static void main(String... args) {
        One one = new One(1234);
        Two<Double> two = new Two<>(22.4);

        two.show();
    }
}
