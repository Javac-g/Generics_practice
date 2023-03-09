package AllThemesFromStart.GenClass.V2;

public class Main {
    public static void main(String...args){

        A<String> one = new A<>("Hello");
        A<Integer> two = new A<>(1234);
        A<Thread> three = new A<>(new Thread("first"));

        one.show();
        two.show();
        three.show();

    }
}
