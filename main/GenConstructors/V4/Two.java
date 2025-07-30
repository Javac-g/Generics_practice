package main.GenConstructors.V4;

public class Two <T extends Number>{//Generic Class
    private  final Float first;
    private final Double second;

    public <V extends Number> Two(T first,V second){//Generic constructor
        this.first = first.floatValue();
        this.second = second.doubleValue();
    }
    public Float getFirst(){
        return first;
    }
    public Double getSecond(){
        return second;
    }
    public  <R extends Number>Double average(R r1,R r2){//Generic Method
        return (r1.doubleValue() + r2.doubleValue()) / 2;
    }
}
