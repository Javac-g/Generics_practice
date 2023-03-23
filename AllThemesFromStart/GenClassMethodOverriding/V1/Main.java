package AllThemesFromStart.GenClassMethodOverriding.V1;

public class Main {
    public static void main(String...args){
        
        One<Integer> one = new One<>(123);
        Two<Integer> two = new Two<>(432);
        Two<String> three = new Two<>("Hello");

        System.out.println(one.getOb());
        System.out.println(two.getOb());
        System.out.println(three.getOb());
    }



}
