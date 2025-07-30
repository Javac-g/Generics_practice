package main.GenClassHierarchy.V2;

public class One <T>{
    private T ob;
    public One(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
    public void showType(){
        System.out.println("Parent type: " + ob.getClass().getSimpleName());
    }
}
