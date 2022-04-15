public class Main {
    public static void main(String...args){


        One<Integer> A = new One<Integer>(123);
        One<String> B =  new One<>("Hello");

        System.out.println(A.getOb());

    }
}
