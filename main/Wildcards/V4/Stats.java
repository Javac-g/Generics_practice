package main.Wildcards.V4;

public class Stats<T extends Number> {
    private final T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    public T[] getNums(){
        return nums;
    }
    public Double average(){
        double sum = 0.0;
        for (int i = 0;i< nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    public boolean isSameA(Stats<T> ob){ //Will work only with similar class type, T defined while create class
        return average().equals(ob.average());
    }
    public boolean isSameB(Stats<?> ob){ // Using wildcards
        return average().equals(ob.average());
    }
    public <V extends Number> boolean isSameC(Stats<V> ob){ // Using generic method to define Type
        return average().equals(ob.average());
    }
    public <V extends  Number,R extends Stats<V>> boolean isSameD(R ob){ // Using more complicated generic method
        return average().equals(ob.average());                          // Define type , and class type of object
    }
}
