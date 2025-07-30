package main.GenClass.V1;

import main.Wildcards.V1.One;

public class Main {
    public static void main(String...args){
        A<String> str = new A<>("Hello");
        str.showType();
        //Type sequrity
        B iob = new B(88);
        int v = (Integer) iob.getO();
        B strOb = new B("hello");
        String strstr = (String)strOb.getO();

        iob = strOb;
        //v = (Integer) iob.getO();! throws runtime exception !
        //Class with 2 params
        C<String,Integer> one = new C<>("Hello",321);
        one.show();
        //Extended types
        Integer[] nums = {1,2,3,4,5};
        One<Integer> two = new One<>(nums);
        double d = two.average();
        System.out.println("5 average: " + d);

    }
}
