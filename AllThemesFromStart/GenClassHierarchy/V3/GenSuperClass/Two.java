package AllThemesFromStart.GenClassHierarchy.V3.GenSuperClass;

public class Two<T extends Number> extends One<T> {
    //passed Type to SuperClass from left to right.
    // Can be Two extends One<Integer>

    public Two(T ob){
        super(ob);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Child: " + getOb().getClass().getSimpleName());
    }
}
