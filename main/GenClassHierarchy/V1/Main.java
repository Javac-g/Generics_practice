package main.GenClassHierarchy.V1;

public class Main {
    public static void main(String...args){
        Three<Integer,String> three = new Three<>(333,"Hello");
        three.showType();
        Two<String> one = new Two<>("222");
        one.showType();
    }
}
