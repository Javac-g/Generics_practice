package main.GenClassHierarchy.V3.GenSuperClass;

public class Three <T extends Number, V> extends One<T>{
    private final V ob2;

    public Three(T ob,V ob2){
        super(ob);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Child T: " + getOb().getClass().getSimpleName());
        System.out.println("Child V: " + getOb2().getClass().getSimpleName());
    }
}
