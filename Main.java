public class Main {

    static <T> void show_one(One<T> ob){

        System.out.println("Class: " + ob.getClass().getName());
        System.out.println("Value: " + ob.getOb());

    }

    static void show_two(Two<?,?> ob){
        System.out.println("Class: " + ob.getClass().getName());
        System.out.println("T Value: " + ob.getT());
        System.out.println("V Value: " + ob.getV());
    }

    static void show_three(Three<?> ob){

        System.out.println(ob.AVG());

    }

    public static void main(String...args){
        Integer num = 4200;
        String str = "Hello world";

        Integer[] Ivals = { 1,2,3};
        Double[] Dvals = {2.2,2.44,1.23};
        Float[] Fvals = {1.33F,234.3F,1.2F};



        One<Integer> oneA = new One<>(num);
        One<String> oneB = new One<>(str);// Generic class 1 param.
        One raw = new One<>(404); //Raw type.


        Two<Integer,String> two = new Two<>(num,str);//Generic class with 2 param.


        Three<Integer> A = new Three<>(Ivals);
        Three<Double> B = new Three<>(Dvals);
        Three<Float> C = new Three<>(Fvals);


        //output

        show_one(oneB);
        show_one(oneA);
        show_one(raw);

        show_two(two);

        show_three(A);
        show_three(B);
        show_three(C);








    }
}
