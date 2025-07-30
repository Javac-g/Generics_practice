package main.GenClassHierarchy.V4.GenSuperClass;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<>(42144);
        Two<Float,Double> two = new Two<>(12.33F,22.3);

        System.out.println("Class ArgumentClass: ");
        one.show();

        System.out.println("Class Two: ");
        two.show();
    }
}
