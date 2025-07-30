package main.GenClass.V4;

public class Main {
    public static void main(String...args){
        One<Integer> one = new One<>(1234);
        One<String> two = new One<>("Hello W");

        int va1 = one.getT();
        String va2 = two.getT();

        System.out.println("Value: " + va1);
        one.show();

        System.out.println("Value: " + va2);
        two.show();
        //one = two; Type security will NOT allow you to do that.
        //Object vs Generic type. Object have security issues
        Two tone = new Two(12345);
        Two ttwo = new Two("Twotwtwoowt");

        //1.Must clearly cast type to extract value;

        int v1 = (Integer)tone.getT();
        String v2 = (String) ttwo.getT();

        System.out.println("Value: " + tone.getT());
        tone.show();

        System.out.println("Value: " + ttwo.getT());
        ttwo.show();
        //2. Same class doesn't know about variables type inside each other.
        tone = ttwo;//Can but totally wrong;

       // v1 = (Integer)tone.getT();//Runtime error

        Three<Thread ,Throwable> three = new Three<>(new Thread("My thread"),new ArithmeticException());

        three.show();



    }
}
