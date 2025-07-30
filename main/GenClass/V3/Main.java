package main.GenClass.V3;

public class Main {
    public static void main(String...args){
        //Generics can be only Linking types
        One<Integer> first = new One<>(123);
        One<String> second = new One<>("Hello");
        One<Thread> third = new One<>(new Thread("Max"));
        //  first = second; Type security will NOT allow you to do that.
        first.getType();
        System.out.println("Value: " + first.getT());

        second.getType();
        System.out.println("Value: " + second.getT());

        third.getType();
        System.out.println("Value: " + third.getT());
        //Type security issues with using Object to generify class.
        Two tone = new Two(1234);

        Two ttwo = new Two("Hello");
        //1 issue that you must know the type of variable and clearly cast to extract value.
        int iv = (Integer )tone.getT();
        System.out.println("Two int: " + iv);

        String sv = (String) ttwo.getT();
        System.out.println("Two str: " + sv);
        //2 issue that this objects of same class , they can link to each other.
        tone = ttwo; // Will do but totally wrong because they have different types inside.
        //iv = (Integer) tone.getT(); ----- Runtime error because class two have T type String, and we can't cast String to Integer.

        Three<String,Integer> four = new Three<>("Hello World",54321);
        four.show();

    }
}
