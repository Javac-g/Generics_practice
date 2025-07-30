package main.Wildcards.V2;

public class Stats <T extends Number>{
    T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    public Double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    public boolean isSameAverage(Stats<T> ob){
        if (average() == ob.average())return true;
        return false;
    }
    public boolean isSameAverageMeta(Stats<?> ob){
        if (average() == ob.average()){
            return true;
        }
        return false;
    }
}
