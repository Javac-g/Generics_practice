package Trash;

public class Three<T extends Number> {
    T[] arr;

    Three(T[] arr){

        this.arr=arr;

    }

    String AVG(){

        Double sum = 0.0;

        for (int i = 0 ; i <= arr.length-1;i++){

            sum+= arr[i].doubleValue();

        }
        return "Averege: " + sum;
    }

}
