package main.LimitedTypes.V5.LimitedByClassAndInterface;

public class ArgumentClass extends LimitationClass implements LimitationInterfaceTwo, LimitationInterfaceOne {

    @Override
    public void two(){
        System.out.println("Two");
    }
    @Override
    public void one(){
        System.out.println("One");
    }
    @Override
    public void doSomething(){
        System.out.println("Something");
    }
}
