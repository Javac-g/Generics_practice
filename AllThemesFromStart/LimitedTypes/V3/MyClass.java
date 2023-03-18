package AllThemesFromStart.LimitedTypes.V3;

public class MyClass <T extends LimitClass & LimitInterface & LimitInterfaceSecond>{
    // Type T limit by class & interfaces
    // LimitClass must implements interfaces  and passed to Type or his custom subclass
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
