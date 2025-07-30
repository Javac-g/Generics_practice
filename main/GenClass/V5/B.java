package main.GenClass.V5;

public class B <T,V>{
    private final T t;
    private final V v;

    public B(T t, V v){
        this.t= t;
        this.v = v;
    }
    public T getT(){
        return t;
    }
    public V getV(){
        return v;
    }
    public void show(){
        System.out.println("T: " + getT().getClass().getSimpleName());
        System.out.println("V: " + getV().getClass().getSimpleName());
    }
}
