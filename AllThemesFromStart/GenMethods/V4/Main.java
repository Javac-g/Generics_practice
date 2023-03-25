package AllThemesFromStart.GenMethods.V4;

public class Main {
    public static <T extends Comparable<T>, V extends T> boolean isIn(T[] vals, V num){
        for (T val : vals) {
            if (num.equals(val)) return true;
        }
        return false;
    }

    public static void main(String...args){
        Integer[] vals = {1,3,2,5,7,8,4};
        Integer[] nums = {3,64,23,7,99,4,33};

        for (int i = 0;i < vals.length;i++){
            boolean flag = isIn(vals,nums[i]);
            boolean flag2 = Main.<Integer,Integer>isIn(vals,nums[i]);

            if (flag){
                System.out.println(flag + ": " + nums[i]);
            }else if (!flag){
                System.out.println(flag + ": " + nums[i]);
            }
        }
    }
}
