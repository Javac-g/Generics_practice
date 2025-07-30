package main.ArraysErrors;

public class Human <T extends Number>{
    private final T ob;
    public Human(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}
