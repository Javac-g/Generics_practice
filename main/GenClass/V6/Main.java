package main.GenClass.V6;

public class Main {

    public static void main(String... args){

        One<Integer> o1 = new One<>(312);
        One<String> o2 = new One<>("hello");

        int v1 = o1.getValue();
        System.out.println("Value: " + v1);
        o1.show();

        String v2 = o2.getValue();
        System.out.println("Value: " + v2);
        o2.show();

        //o1=o2; type security not allowed such operation due to a different data types inside

        Two<String,Double> two = new Two<>("Hallo",543.0);
        double tv2 = two.getVal2();
        System.out.println("Value V: " + tv2);
        String tv1 = two.getVal1();
        System.out.println("Value T: " + tv1);
        two.show();

        Three t1 = new Three(123);
        Three t2 = new Three("hi hi hi");

        int thv1 = (Integer) t1.getObject();
        System.out.println("Object value: " + thv1);
        t1.show();

        t1 = t2; // allowed because Object doesn't know about data types inside class

        thv1 = (Integer) t1.getObject(); // class cast exception
        System.out.println("Object value: " + thv1);
        t1.show();







    }
}
