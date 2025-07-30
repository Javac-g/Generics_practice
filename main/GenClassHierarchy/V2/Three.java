package main.GenClassHierarchy.V2;

public class Three <T,V> extends One<T>{

    private V ob2;

    public Three(T ob1,V ob2){
        super(ob1);
        this.ob2 = ob2;
    }
    public V getOb2(){
        return ob2;
    }
    @Override
    public void showType(){
        super.showType();
        System.out.println("Child type: " + getOb().getClass().getSimpleName());
        System.out.println("Child type: " + getOb2().getClass().getSimpleName());
    }

}
