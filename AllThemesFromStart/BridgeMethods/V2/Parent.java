package AllThemesFromStart.BridgeMethods.V2;

public class Parent <T>{
    protected final T ob;
    public Parent(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}
