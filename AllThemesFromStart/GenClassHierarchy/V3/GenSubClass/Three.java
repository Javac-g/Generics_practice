package AllThemesFromStart.GenClassHierarchy.V3.GenSubClass;

public class Three <T , V> extends One<T>{
    private final V ob2;

    public Three(T ob,V ob2){
        super(ob);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }

}
