package AllThemesFromStart.ExtendedTypes.V2;

public class Main {

    public static void main(String...args){
        Integer[] nums1 = {1,2,3,4,5};
        Double[] nums2 = {1.1,2.2,3.3,4.4,5.5};

        Stats<Integer> one = new Stats<>(nums1);
        Stats<Double> two = new Stats<>(nums2);

        System.out.println("One average: " + one.average());
        System.out.println("Two average: " + two.average());

    }
}
