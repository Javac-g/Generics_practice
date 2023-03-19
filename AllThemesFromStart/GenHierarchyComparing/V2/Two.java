package AllThemesFromStart.GenHierarchyComparing.V2;

public class Two <T extends String,V extends Throwable> extends One<T>{
    private final V ob2;

    public Two(T ob, V ob2){
        super(ob);
        this.ob2 = ob2;

    }
}
