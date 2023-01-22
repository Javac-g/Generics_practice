package AllThemesFromStart.GenSubclass;

public class Two <T> extends One{
    private final T ob ;

    public Two(int num, T ob) {
        super(num);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}
