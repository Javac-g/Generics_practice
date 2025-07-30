package main.BridgeMethods.V2;

public class Child extends Parent<String>{
    public Child(String o){
        super(o);
    }
    @Override
    public String getOb(){
        System.out.println("Child method");
        return ob;
    }
}
