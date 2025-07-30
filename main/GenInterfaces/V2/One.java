package main.GenInterfaces.V2;

public class One<T extends Comparable<T>> implements MyInterface<T>{
   private T[] values;
   public One(T[] values){
       this.values = values;
   }


    @Override
    public T min(){
        T min = values[0];
        for (int i = 0; i < values.length;i++){
            if (values[i].compareTo(min) < 0){
                min = values[i];
            }
        }
        return min;

    }
    public T max(){
       T max = values[0];
        for (int i = 0; i < values.length;i++){
            if (values[i].compareTo(max) > 0){
                max = values[i];
            }
        }
        return max;
    }
}
