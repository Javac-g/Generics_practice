package main.GenClass.V6;

public class One <T>{ // cant have primitives as T - should only be Linking type
    private final T value; // cant be initialized before type assigned, JVM should knew type

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
