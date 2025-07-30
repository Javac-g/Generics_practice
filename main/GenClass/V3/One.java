package main.GenClass.V3;

public class One<T> {
    private T t ;
    //Cant initialize generic  like 'private T t = new T();'
    public One(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
    public void getType(){
        System.out.println(t.getClass().getSimpleName());
    }

}
