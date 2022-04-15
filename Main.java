public class Main {

    public static void main(String...args){

        One<Integer> A = new One<Integer>(123);// one G args
        One<String> B =  new One<>("Hello");
        One raw = new One(12334); // Raw Type , used for old,inherited code.

        Two<Integer,String> C = new Two<>(1234,"Hello"); // two G args
        three<Integer>  D = new three<>(1111); // G interface and extends
        Four<Integer> four = new Four<>(4422); //Metasymbols
        Five fiveOne = new Five(21); // G constructors
        Five fiveTwo = new Five(4343,"Hello");

        System.out.println(A.getOb());
        System.out.println(B.getOb());
        System.out.println(C.getT());
        System.out.println(C.getV());
        System.out.println(D.getT());

    }
}
