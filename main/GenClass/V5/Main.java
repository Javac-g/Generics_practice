package main.GenClass.V5;

public class Main {
    public static void main(String...args){
        A<Integer> a = new A<>(1234);
        Integer aval = a.getOb();

        System.out.println("Value: " + aval);
        a.show();

        A<String> a1 = new A<>("Hello");
        String a1val = a1.getOb();

        System.out.println("a1 Value: " + a1val);
        a1.show();

        B<Integer,String> b = new B<>(321,"hi hi hi");
        Integer bval = b.getT();
        String bsval = b.getV();

        System.out.println("B int: " + bval);
        System.out.println("B str: " + bsval);

        b.show();

        //a = b type security will not allow you do that
        //Object vs Generic type. Object have security issues

        C c1 = new C(123);
        C c2 = new C("hi");

        c1.show();
        Integer i = (Integer) c1.getObject();//1. must be clear typed
        //c1 = c2 Same class doesn't know about variables type inside each other.

       // Integer cvi = (Integer) c1.getObject(); Runtime error beacause c1 now contains String type value



    }
}
