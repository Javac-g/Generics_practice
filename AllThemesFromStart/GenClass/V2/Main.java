package AllThemesFromStart.GenClass.V2;

public class Main {
    public static void main(String...args){

        A<String> one = new A<>("Hello");
        A<Integer> two = new A<>(1234);
        A<Thread> three = new A<>(new Thread("first"));

        one.show();
        System.out.println("Value: " + one.getOb());

        two.show();
        System.out.println("Value: " + two.getOb());

        three.show();
        System.out.println("Value: " + three.getOb());
        // next
        B bone = new B(88);
        bone.show();

        B btwo = new B("HW");
        btwo.show();

        int a = (Integer) bone.getOb();
        String b = (String) btwo.getOb();
        /*
        bone = btwo;//types weakness
        a = (Integer) bone.getOb();//runtime error
        */

        //next
        C<String ,Integer> cone = new C<>("Hello",3256);
        cone.show();

    }
}
