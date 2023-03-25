package AllThemesFromStart.RawTypes.V4;

public class Main {
    public static void main(String...args){
        One<Integer> one = new One<>(50000);
        int iv = one.getOb();
        System.out.println("Int: " + iv);

        One<String> two = new One<>("HW");
        String str = two.getOb();
        System.out.println("String: " + str);

        One raw = new One<>(new Double(99.2));
        //T = Object automatically

        double d = (Double) raw.getOb();//Must clearly cast type
        System.out.println("Double: " + d);

       //Thread t  = (Thread)raw.getOb(); //Runtime error
        two = raw;//can but totally wrong
        //str = two.getOb();//Run time error

        raw = one;//can but totally wrong
        //d = (Double) raw.getOb(); Runtime error
    }
}
