package AllThemesFromStart.GenClassHierarchy;

public class Two <T> extends One<T>{
    public Two(T ob){
        super(ob);
    }

    @Override
    public void showType() {
        super.showType();
        System.out.println("Child type:  " + ob.getClass().getSimpleName());

    }
}
