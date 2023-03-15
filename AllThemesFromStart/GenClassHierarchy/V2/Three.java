package AllThemesFromStart.GenClassHierarchy.V2;

public class Three <T,V> extends One<T>{

    private V ob2;

    public Three(T ob1,V ob2){
        super(ob1);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }

}
