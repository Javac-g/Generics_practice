package main.GenInterfaces.V4;

public class Stats<T extends Comparable<T>> implements MinMax<T>{
    // Passed T type to interface thats implements.
    //T type thats passed Must have same upper Limit like in Interface
    // Or can be that Stats implements MinMax<Integer>

    private final T[] nums;

    public Stats(T[] nums){
        this.nums = nums;
    }
    public T[] getNums(){
        return nums;
    }

    @Override
    public T min() {
        T min = nums[0];
        for (int i = 0;i < nums.length;i++){
            if (min.compareTo(nums[i]) > 0){
                min = nums[i];
            }
        }
        return min;
    }

    @Override
    public T max() {
        T max = nums[0];
        for (int i = 0; i < nums.length;i++){
            if (max.compareTo(nums[i]) < 0){
                max = nums[i];
            }
        }
        return max;
    }
}
