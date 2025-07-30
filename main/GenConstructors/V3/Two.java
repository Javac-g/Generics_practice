package main.GenConstructors.V3;

public class Two <T extends Number>{
    T ob1;
    Double ob2;
    public <V extends Number> Two(T ob1,V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2.doubleValue();
    }

    public  <R extends Double> boolean getSum(R ob){
        return ob.equals(ob1);
    }
}
