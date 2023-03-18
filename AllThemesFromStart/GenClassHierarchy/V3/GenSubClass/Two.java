package AllThemesFromStart.GenClassHierarchy.V3.GenSubClass;

public class Two<T> extends One<T> {
    //passed Type to SuperClass from left to right.
    // Can be Two extends One<Integer>
    public Two(T ob){
        super(ob);
    }
}
