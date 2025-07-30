package main.LimitedTypes.V4;

public class Main {
    public static void main(String... args) {
        Integer[] num1 = {1,2,3,4,5};

        Double[] num2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        One<Integer> one = new One<>(num1);
        One<Double> two = new One<>(num2);

        System.out.println("Integer average: " + one.average());
        System.out.println("Double average: " + two.average());

        Two ob = new Two();
        MyClass<Two> myClass = new MyClass<>(ob);
        myClass.show();
     }
}
