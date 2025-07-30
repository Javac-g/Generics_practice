package main.GenClass.V6;

public class Three {

    private final Object object;

    public Three(Object object){
        this.object = object;
    }
    public Object getObject(){
        return object;
    }
    public void show(){
        System.out.println("Object type: " + object.getClass());
    }
}
