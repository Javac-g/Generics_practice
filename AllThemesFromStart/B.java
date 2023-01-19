package AllThemesFromStart;

public class B {
    Object o;

    public B(Object o){
        this.o = o;
    }

    public void setO(Object o) {
        this.o = o;
    }
    public void show(){
        System.out.println(o.getClass().getSimpleName());
    }
}
