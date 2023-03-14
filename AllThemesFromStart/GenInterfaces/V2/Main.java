package AllThemesFromStart.GenInterfaces.V2;

public class Main {
    public static void main(String...args){
        Integer[] nums = {1,2,3,4,5,6,4,3,2,3,5,6,4,3,2998};
        One<Integer> one = new One<>(nums);
        System.out.println("Min: " + one.min());
        System.out.println("Max: " + one.max());
    }
}
