public class Main {
    static void p(One<?> o){
        System.out.println("Type: " + o.getClass().getName());
        System.out.println("Value: " + o.getOb());
    }
    public static void main(String...args){
        Integer num = 4200;
        String str = "Hello world";

        One<String> two = new One<>(str);
        One<Integer> one = new One<>(num);
        One raw = new One<>(404); //Raw type

        p(two);
        p(one);
        p(raw);




    }
}
