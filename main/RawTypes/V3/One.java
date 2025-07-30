package main.RawTypes.V3;

public class One <T>{
    private final T ob;

    public One(T ob){
        this.ob = ob;
    }

    public T getOb(){
        return ob;
    }

}
