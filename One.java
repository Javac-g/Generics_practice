public class One<T> {
    T ob;

    One(T ob){

        this.ob = ob;

    }

    public T getOb() {

        return ob;

    }

    public String show(T ob){

        return ob.getClass().getName();

    }
}
