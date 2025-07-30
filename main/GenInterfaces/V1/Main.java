package main.GenInterfaces.V1;

public class Main {
    public static void main(String...args){

        Integer[] nums = {1,2,3,4,5};

        One<Integer> one = new One<>(nums);

        System.out.println("Max: " + one.max());
        System.out.println("Min: " + one.min());

    }
}
