package main.GenClass.V4;

public class Two {
    private final Object t;

    public Two(Object t){
        this.t = t;
    }
    public Object getT(){
        return t;
    }
    public void show(){
        System.out.println(t.getClass().getSimpleName());
    }
}
