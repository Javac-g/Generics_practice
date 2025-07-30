package main.LimitedTypes.V5.LimitedByClassAndInterface;

public class GenericImplementation<T extends LimitationClass & LimitationInterfaceTwo & LimitationInterfaceOne>{
    private final T t;

    public GenericImplementation(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
    public void show(){
        t.one();
        t.two();
        t.doSomething();
        System.out.println("Class: " + t.getClass().getSimpleName());
    }
}
