package Trash;

public class Five<T extends Comparable<T>> implements MinMax {

    T[] arr;

    Five(T[] arr){

        this.arr= arr;

    }

    public T min(){
        T min = arr[0];
        for (int i = 0 ; i <= arr.length-1;i++){

            if(arr[i].compareTo(min) < 0){

                min = arr[i];
            }
        }
        return min;
    }

    public T max(){
        T max = arr[0];
        for (int i = 0; i <= arr.length-1;i++){
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
}
