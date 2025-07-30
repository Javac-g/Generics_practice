package main.RawTypes.V2;

public class One <T>{
    private final T ob;
    public One(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }

}
