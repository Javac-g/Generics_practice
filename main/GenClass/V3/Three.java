package main.GenClass.V3;

public class Three <T,V>{
    private T t;
    private V v;

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
        System.out.println(getT() + ": " + t.getClass().getSimpleName());
        System.out.println(getV() + ": " + v.getClass().getSimpleName());
    }
}
