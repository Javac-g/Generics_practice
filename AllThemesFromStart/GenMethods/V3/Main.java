package AllThemesFromStart.GenMethods.V3;

public class Main {
    public static <T extends Comparable<T>,V extends T> boolean isIn(V[] arr,T x){
        for (int i = 0 ; i < arr.length;i++){
            if (x.equals(arr[i]))return true;
        }
        return false;
    }
    public static void main(String...args){
        Integer[] nums = {1,2,3,4,5,6,8,9};
        Integer[] vars = {11,12,13,1,2,3,6,8};

        for (int i = 0;i < nums.length;i++){
            boolean flag = Main.<Integer,Integer>isIn(nums,vars[i]);
            if (flag){
                System.out.println(vars[i] + ": " + flag);
            } else if (!flag) {
                System.out.println(vars[i] + ": " + flag);
            }
        }
    }
}
