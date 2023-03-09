package AllThemesFromStart.GenClass.V2;

public class A <T>{
    private final  T ob;

    public A(T ob){
        this.ob = ob;
    }

    public T getOb(){
        return ob;
    }
    public void show(){
        System.out.println("Class: " + ob.getClass().getSimpleName());

    }
}
