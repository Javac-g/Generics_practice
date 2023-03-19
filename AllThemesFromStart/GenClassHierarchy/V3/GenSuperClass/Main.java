package AllThemesFromStart.GenClassHierarchy.V3.GenSuperClass;

public class Main {
    public static void main(String[] args) {
        One<Integer> A = new One<>(11111);
        Two<Double> B = new Two<Double>(2231.1);
        Three<Integer,String> C = new Three<>(12345,"Hello");

        System.out.println("Class One: ");
        A.show();

        System.out.println("Class Two: ");
        B.show();

        System.out.println("Class Three: ");
        C.show();



    }
}
