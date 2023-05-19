package AllThemesFromStart.GenClass.V5;

public class A <T>{
    //T must be Linking type only
    private final T ob;// cant initialize like T ob = new T(); because JVM need to know type for that.
    public A (T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
    public void show(){
        System.out.println("T: " + getOb().getClass().getSimpleName());
    }
}
