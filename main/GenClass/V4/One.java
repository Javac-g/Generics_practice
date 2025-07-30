package main.GenClass.V4;

public class One<T> {
    // T can be only Linking type;
    private final T t;
    // Cant initialize like T t = new T(); because type unknown

    public One(T t){
        this.t = t;
    }
    public T getT(){
        return t;
    }
    public void show(){
        System.out.println(t.getClass().getSimpleName());
    }

}
