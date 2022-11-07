package v9.GenApp;

public class App {
    public static void main(String...args){

        Integer ob = new Integer(35);
        String str = new String("Hello");

        One<Integer> a = new One<>(ob);
        One<String> b = new One<>(str);

        a.show();
        b.show();

    }
}
