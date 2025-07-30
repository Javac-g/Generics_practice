package main.RawTypes.V1;

public class Main {
    public static void main(String...args){

        One<Integer> one = new One<>(234);
        One<String> two = new One<>("Hello");
        One raw = new One(22.4);

        Integer i = one.getOb();
        String s = two.getOb();
        Double d = (Double) raw.getOb();//require type bounding to extract value.
        int ir = (Integer) raw.getOb(); //Throws error.
        two = raw;
        String str = two.getOb();//Throws error.
    }
}
