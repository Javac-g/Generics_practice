package AllThemesFromStart.GenTypesCasting;

public class Main {
    public static void main(String...args){

        One one = new One(123);
        Two<Integer> two = (Two<Integer>) one;

    }

}
