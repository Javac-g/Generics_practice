public class Main {

    public static void main(String...args){

        One<Integer> A = new One<Integer>(123);
        One<String> B =  new One<>("Hello");

        Two<Integer,String> C = new Two<>(1234,"Hello");

        System.out.println(A.getOb());
        System.out.println(B.getOb());
        System.out.println(C.getT());
        System.out.println(C.getV());

    }
}
