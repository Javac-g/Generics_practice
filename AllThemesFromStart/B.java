package AllThemesFromStart;

public class B {
    Object o;

    public B(Object o){
        this.o = o;
    }

    public Object getO() {
        return o;
    }

    public void show(){
        System.out.println(o.getClass().getSimpleName());
    }
}
