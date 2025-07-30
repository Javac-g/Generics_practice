package main.LimitedTypes.V4;

public class MyClass <T extends LimitClass & LimitInterfOne & LimitInterfTwo>{
    // upper limit with Class and interface
    // T can be LimitClass that implements those interfaces or his Subclass
    private final T ob;
    public MyClass(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
    public void show(){
        System.out.println(ob.getClass().getSimpleName());
    }
}
