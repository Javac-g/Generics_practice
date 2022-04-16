public class Main {
    static void show_one(One<?> ob){
        System.out.println("Class: " + ob.getClass().getName());
        System.out.println("Value: " + ob.getOb());
    }

    static void show_two(Two<?,?> ob){
        System.out.println("Class: " + ob.getClass().getName());
        System.out.println("T Value: " + ob.getT());
        System.out.println("V Value: " + ob.getV());
    }
    public static void main(String...args){
        Integer num = 4200;
        String str = "Hello world";


        One<Integer> oneA = new One<>(num);
        One<String> oneB = new One<>(str);// Generic class 1 param.
        One raw = new One<>(404); //Raw type.


        Two<Integer,String> two = new Two<>(num,str);//Generic class with 2 param.

        //output

        show_one(oneB);
        show_one(oneA);
        show_one(raw);

        show_two(two);








    }
}
