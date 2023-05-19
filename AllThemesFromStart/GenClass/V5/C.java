package AllThemesFromStart.GenClass.V5;

public class C {
    private final Object object;
    public C(Object object){
        this.object = object;
    }

    public Object getObject(){
        return object;
    }
    public void show(){
        System.out.println("Object: " + getObject().getClass().getSimpleName());
    }
}
