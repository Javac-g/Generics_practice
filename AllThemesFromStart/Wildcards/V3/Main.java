package AllThemesFromStart.Wildcards.V3;

import java.util.Arrays;

public class Main {
    public static void main(String...args){
        Integer[] n1 = {1,2,3,4,5};
        Double[] n2 = {1.1, 2.2, 3.3, 4.4, 5.5};

        Stats<Integer> one = new Stats<>(n1);
        Stats<Integer> two = new Stats<>(n1);
        Stats<Double> three = new Stats<>(n2);
        Stats<Double> four = new Stats<>(n2);
        System.out.println(Arrays.toString(one.getNums()));
        System.out.println(one.isSameA(two));//same class type
        //System.out.println(one.isSameOnly(three)); will not work because one - T - integer require same T in method
        System.out.println(one.isSameC(three));// Stats<?> - wildcart will accept Stats with any type
        System.out.println(one.isSameA(three));// generify method
        System.out.println(one.isSameB(three));
        System.out.println(one.isSameC(two));// Stats<?> - wildcart will accept Stats with any type
        System.out.println(one.isSameA(two));// generify method
        System.out.println(one.isSameB(two));
        System.out.println(one.isSameC(one));// Stats<?> - wildcart will accept Stats with any type
        System.out.println(one.isSameA(one));// generify method
        System.out.println(one.isSameB(one));
    }


}
