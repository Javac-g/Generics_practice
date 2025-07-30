package main.Wildcards.V1;

public class One <T extends Number>{
    private T[] nums;

    public One(T[] nums) {
        this.nums = nums;
    }
    public double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length;i++){
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    public boolean sameAvg(One<?> one){
        if (average() == one.average()){
            return true;
        }
        return false;
    }
}
