package main.Wildcards.V3;

public class Stats <T extends Number>{
    private final T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    public T[] getNums(){
        return nums;

    }

    public Double getAverage(){
        double average = 0.0;
        for (T num : nums) {
            average += num.doubleValue();
        }
        return average/ nums.length;
    }
    public <V extends Number> boolean isSameA(Stats<V> ob){
        return getAverage().equals(ob.getAverage());
    }
    public <R extends Number,V extends Stats<R>> boolean isSameB(V ob){
        return getAverage().equals(ob.getAverage());
    }
    public boolean isSameC(Stats<?> ob){
        return getAverage().equals(ob.getAverage());
    }

}
