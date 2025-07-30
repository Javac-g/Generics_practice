package main.GenConstructors.V2;

public class One {
   private final Double sum;

    public <T extends Number>One(T sum){
        this.sum = sum.doubleValue();
    }
    public void getSum(){
        System.out.println("Sum: " + sum);
    }

}
