package main.GenHierarchyComparing.V3;

public class One <T extends Number>{
    protected final T ob;
    public One(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}
