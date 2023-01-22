package AllThemesFromStart.GenTypesCasting;

public class Main {
    public static void main(String...args){


        Two<Integer> two = new Two<>(4344);
        One<Integer> two1 = two;
        System.out.println(two1.getClass().getSimpleName());

    }

}
