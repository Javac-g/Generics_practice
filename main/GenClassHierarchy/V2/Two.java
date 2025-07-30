package main.GenClassHierarchy.V2;

public class Two <T> extends One<T>{

    public Two(T ob){
        super(ob);
    }
    @Override
    public void showType(){
        super.showType();
        System.out.println("Child type: " + getOb().getClass().getSimpleName());
    }
}
