package AllThemesFromStart.GenInterfaces.V3;

public class Stats <T extends Comparable<T>> implements MinMax<T>{
    //Pass T to Interface from left to right , interface limit T extends Comparable T , so Class passed it must have that too.
    //Also can be  Stats implements MinMax<Integer>
    private final T[] nums;

    public Stats(T[] nums){
        this.nums = nums;
    }

    @Override
    public T min() {
        T min = nums[0];
        for (int i = 0; i < nums.length;i++){
            if (min.compareTo(nums[i]) > 0)min = nums[i];
        }
        return min;
    }

    @Override
    public T max() {
        T max = nums[0];
        for (int i = 0; i < nums.length;i++){
            if (max.compareTo(nums[i]) < 0) max = nums[i];
        }
        return max;
    }
}
