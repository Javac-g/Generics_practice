package AllThemesFromStart.GenClassMethodOverriding.V1;

public class Two <T> extends One<T>{
    public Two(T ob) {
        super(ob);
    }

    @Override
    public T getOb(){
        System.out.println("Class Two");
        return ob;
    }
}
