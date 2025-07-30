package main.GenClass.V6;

public class Main {

    public static void main(String... args){

        One<Integer> o1 = new One<>(312);
        One<String> o2 = new One<>("hello");

        int v1 = o1.getValue();
        System.out.println("Value: " + v1);
        o1.show();

        String v2 = o2.getValue();
        System.out.println("Value: " + v2);
        o2.show();

        Two<String,Double> two = new Two<>("Hallo",543.0);
        double tv2 = two.getVal2();
        System.out.println("Value V: " + tv2);
        String tv1 = two.getVal1();
        System.out.println("Value T: " + tv1);
        two.show();






    }
}
