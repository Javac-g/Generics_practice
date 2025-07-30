package main.GenClassHierarchy.V4.GenSubClass;

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
        System.out.println("Num value: " + getNum());
        System.out.println("T value: " + getOb());
    }
}
