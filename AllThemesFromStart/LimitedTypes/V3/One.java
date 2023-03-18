package AllThemesFromStart.LimitedTypes.V3;

public class One <T extends Number>{

    // T extends Number its upper limit - Number and subclass
    // This prevents creating  version of class One with non-number type T
    private final T[] nums;
    public One(T[] nums){
        this.nums = nums;
    }
    public T[] getNums(){
        return nums;
    }
    public Double getAverage(){
        double sum = 0.0;
        for (int i = 0; i < nums.length;i++){
            sum += nums[i].doubleValue();// nums[i] Must be number so we need to extend Number to limit Types range
        }
        return sum / nums.length;
    }
}
