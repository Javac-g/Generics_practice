package main.LimitedTypes.V5;

public class Main {

    public static void main(String... args){
        Stats<Integer> stats = new Stats<>(new Integer[]{1,2,3,4,5,6,7,8});
        System.out.println("Average: " + stats.average());
    }
}
