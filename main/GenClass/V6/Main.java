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






    }
}
