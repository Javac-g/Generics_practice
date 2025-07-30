package main.LimitedTypes.V4;

public class One <T extends Number>{
    private final T[] nums;

    public One(T[] nums){
        this.nums = nums;
    }
    public Double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length;i++){
            sum+=nums[i].doubleValue();
        }
        return sum / nums.length;

    }

}
