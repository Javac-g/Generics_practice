package main.LimitedTypes.V2;

public class Stats <T extends Number>{
    T[] arr;
    public  Stats(T[] arr){
        this.arr = arr;
    }
    public double average(){
        double sum = 0.0;
        for  (int i = 0; i < arr.length;i++){
            sum += arr[i].doubleValue();
        }
        return sum/arr.length;
    }
}
