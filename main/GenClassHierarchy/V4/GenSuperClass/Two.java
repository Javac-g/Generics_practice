package main.GenClassHierarchy.V4.GenSuperClass;

public class Two <T extends Number,V> extends One<T>{
    //passed Type to SuperClass from left to right.
    // Can be Two extends ArgumentClass<Integer>
    private final V ob2;
    public Two(T ob,V ob2){
        super(ob);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Child: 1 " + ob.getClass().getSimpleName());
        System.out.println("Child: 2 " + ob2.getClass().getSimpleName());
    }
}
