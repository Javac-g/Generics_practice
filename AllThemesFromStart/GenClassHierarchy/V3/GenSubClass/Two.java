package AllThemesFromStart.GenClassHierarchy.V3.GenSubClass;

public class Two <T extends Number> extends One{

    public Two(T ob){
        super(ob.intValue());

    }
}
