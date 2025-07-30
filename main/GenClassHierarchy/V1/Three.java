package main.GenClassHierarchy.V1;

public class Three <T,V> extends One<T>{
    private final V v;

    public Three(T t, V v){
        super(t);
        this.v = v;
    }


    public V getV(){
        return v;
    }
    public void showType(){
        super.showType();
        System.out.println("Child type: " + ob.getClass().getSimpleName());
        System.out.println("Child type: " + v.getClass().getSimpleName());
    }
}
