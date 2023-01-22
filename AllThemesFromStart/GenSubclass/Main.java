package AllThemesFromStart.GenSubclass;

public class Main {
    public static void main(String...args){
        Two<String> ob = new Two<>(45,"Hello");
        System.out.println(ob.getOb());
        System.out.println(ob.getNum());
    }
}
