package main.GenClassHierarchy.V2;

public class Five <T> extends FourNG{
    private  T ob;
    public Five(T ob,int i){
        super(i);
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
}
