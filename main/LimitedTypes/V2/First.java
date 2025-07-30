package main.LimitedTypes.V2;

public class First<T extends Third & MyFirst> {
    T ob;
    public  First(T ob){
        this.ob = ob;
    }
}
