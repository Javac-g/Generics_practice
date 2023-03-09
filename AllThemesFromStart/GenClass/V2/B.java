package AllThemesFromStart.GenClass.V2;

public class B {
    private final  Object ob;

    public B(Object ob){
        this.ob = ob;
    }
    public Object getOb(){
        return ob;
    }
    public void show(){
        System.out.println(ob.getClass().getSimpleName());
    }


}
