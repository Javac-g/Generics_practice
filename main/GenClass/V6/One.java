package main.GenClass.V6;

public class One <T>{
    private final T value;

    public One(T value){

        this.value = value;

    }

    public T getValue(){
        return value;
    }

    public void show(){
        System.out.println("Generic type: " + value.getClass().getSimpleName());
    }
}
