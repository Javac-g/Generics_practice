package AllThemesFromStart.GenClassHierarchy.V3.GenSuperClass;

public class Three <T extends Number, V> extends One<T>{
    private final V ob2;

    public Three(T ob,V ob2){
        super(ob);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }

}
