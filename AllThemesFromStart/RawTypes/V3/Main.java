package AllThemesFromStart.RawTypes.V3;

public class Main {
    public static void main(String... args) {
        //Raw types used for Legacy code functional
        One<Integer> one = new One<>(123);
        One<String> two = new One<>("Hello");
        One raw = new One<>(new Throwable());// T = Object

        //Raw types requires clear typecasting because type of variable unknown
        Thread t = (Thread) raw.getOb();
        int i = (Integer) raw.getOb();//Runtime error
        //Type security issues
        two = raw; // can but totally wrong
        String str = two.getOb();//Runtime error
        raw = one;//
        t = (Thread) raw.getOb();//Runtime error
    }
}
