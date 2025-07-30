package main.GenConstructors.V1;

public class One {
    private final double val;
    public <T extends Number>  One(T arg){
        val = arg.doubleValue();
    }

    public double getVal() {
        return val;
    }
}
