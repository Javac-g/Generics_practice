package main.GenClass.V3;

public class Two {
    private Object t;

    public Two(Object t){
        this.t = t;
    }
    public Object getT(){
        return t;
    }
    public void getType(){
        System.out.println(t.getClass().getSimpleName());
    }
}
