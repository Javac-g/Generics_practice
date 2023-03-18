package AllThemesFromStart.GenClassHierarchy.V3.GenSubClass;

public class Main {
    public static void main(String[] args) {
        Three<Integer,String> one = new Three<>(12345,"Hello");
        System.out.println(one.getOb().getClass().getSimpleName() + ": " + one.getOb());
        System.out.println(one.getOb2().getClass().getSimpleName() + ": " + one.getOb2());
    }
}
