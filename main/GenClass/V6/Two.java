package main.GenClass.V6;

public class Two<T,V> {
    private final T val1;
    private final V val2;

    public Two(T val1, V val2){
        this.val2 = val2;
        this.val1 = val1;
    }
    public T getVal1(){
        return val1;
    }
    public V getVal2(){
        return val2;
    }
    public void show(){
        System.out.println("Generic type T: " + val1.getClass().getSimpleName());
        System.out.println("Generic type V: " + val2.getClass().getSimpleName());

    }
}
