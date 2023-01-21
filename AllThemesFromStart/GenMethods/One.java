package AllThemesFromStart.GenMethods;

public class One {
    static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] arr){
        for (int i = 0;i < arr.length; i++){
            if (x.equals(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String...args){
        Integer[] nums = {1,2,3,4,5,6};
        if (isIn(5,nums)){
            System.out.println("Yes");
        }
        if (!isIn(7,nums)){
            System.out.println("No");
        }
    }
}
