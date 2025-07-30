package main.GenClassHierarchy.V3.GenSuperClass;

public class One <T extends Number>{
    protected T ob;
    public One(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }

    public void show(){
        System.out.println("Parent: " + ob.getClass().getSimpleName());
    }

}
