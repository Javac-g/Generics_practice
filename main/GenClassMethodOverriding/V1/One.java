package main.GenClassMethodOverriding.V1;

public class One <T>{
    T ob;

    public One(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.println("CLass One");
        return ob;
    }
}
