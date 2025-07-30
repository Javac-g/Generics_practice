package main.GenClassHierarchy.V1;

public class One<T> {
    protected  final T ob;

    public One(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
    public  void showType(){
        System.out.println("Parent class type: " + ob.getClass().getSimpleName());
    }

}
