package main.RawTypes.V2;

public class Main {
    public static void main(String...args){
        One<Integer> iob = new One<>(9823);
        One<String> sob = new One<>("H...W...");
        One raw = new One(new Float(1.32F));

        float f = (Float) raw.getOb();
        System.out.println("Value: " + f);

    }
}
