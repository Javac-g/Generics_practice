package main.GenClass.V4;

public class Three<T,V> {
    private final T t;
    private final V v;

    public Three(T t, V v){
        this.t = t;
        this.v = v;
    }
    public T getT(){
        return t;
    }
    public V getV(){
        return v;
    }
    public void show(){
        System.out.println("V: " + v.getClass().getSimpleName());
        System.out.println("T: " + t.getClass().getSimpleName());
    }
}
