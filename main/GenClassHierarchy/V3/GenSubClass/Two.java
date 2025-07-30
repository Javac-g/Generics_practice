package main.GenClassHierarchy.V3.GenSubClass;

public class Two <T extends Number> extends One{
    private final T ob;
    public Two(T ob){
        super(ob.intValue());
        this.ob = ob;

    }
    public T getOb(){
        return ob;
    }
    public void show(){
        System.out.println("Subclass: " + ob.getClass().getSimpleName());
    }
}
