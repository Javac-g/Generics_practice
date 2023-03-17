package AllThemesFromStart.GenMethods.V2;

public class One {

    public <T extends Comparable<T>, V extends T> boolean isIn(V[] y,T x){
        for(int i = 0; i < y.length;i++){
            if (x.equals(y[i]))return true;
        }
        return false;
    }

    public static void main(String...args){
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        Integer[] vars = {3,5,7,9,0,9,8,9,6,4,1};

        String[] words = new String[]{"Hello","My","Name","Is","Max"};
        String[] str = {"Hello","Is"};
        One disp = new One();
        for (int i = 0;i < nums.length;i++){
            boolean flag = disp.isIn(vars,nums[i]);
            boolean flag2 = disp.<String,String>isIn(str,words[i]);

            if (flag2) {

                System.out.println("TRUE: " + words[i]);
            }
            else if(!flag2)

                System.out.println("FALSE: " +words[i]);

            }
        }
    }

