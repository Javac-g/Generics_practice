package main.GenConstructors.V4;

public class Main {
    public static void main(String... args) {
        One one = new One(1.23F);
        System.out.println("Value: " + one.getVal());
        Two<Float> two = new Two<>(1.32F,22);
        System.out.println("First: " + two.getFirst());
        System.out.println("Second: " + two.getSecond());
        System.out.println("Average: " + two.average(two.getFirst(), two.getSecond()));
    }
}
