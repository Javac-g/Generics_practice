package main.GenClass.V2;

public class C <T,V>{
    private T t;
    private V v;

    public C(T t,V v){
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
        System.out.println("T: " + t.getClass().getSimpleName());
        System.out.println("V: " + v.getClass().getSimpleName());
    }
}
