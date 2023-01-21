package AllThemesFromStart.GenClass;

public class A<T> {
    private final T param;

    public A(T param){
        this.param = param;
    }
    public T getParam(){
        return param;
    }
    public void showType(){
        System.out.println(param.getClass().getSimpleName());
    }
}
