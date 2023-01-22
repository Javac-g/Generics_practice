package AllThemesFromStart.GenClassMethodOverriding;

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
