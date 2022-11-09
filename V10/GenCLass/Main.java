package V10.GenCLass;

public class Main {
    static <T> void process(One<T> c){
        System.out.print(c.getValue() + " - ");
        System.out.println(c.getValue().getClass().getName());
    }
    public static void main(String...args){
        One<String> str = new One<>("Hello");
        One<Integer> num = new One<>(123);
        process(str);
        process(num);

    }
}
