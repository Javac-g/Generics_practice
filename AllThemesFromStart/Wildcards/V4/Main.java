package AllThemesFromStart.Wildcards.V4;

public class Main {
    public static void main(String...args) {
        Integer[] nums1 = {1, 2, 3, 6, 5, 4, 3, 2, 1};
        Double[] nums2 = {1.1, 2.2, 3.3, 6.6, 5.5, 4.4, 3.3, 2.2, 1.1};

        Stats<Integer> sone = new Stats<>(nums1);
        Stats<Double> stwo = new Stats<>(nums2);

        System.out.println(sone.isSameA(sone)); // worked only if Type parameters same
        //System.out.println(sone.isSameA(stwo)); // Types difference generate Compile time error
        System.out.println(sone.isSameB(stwo)); // Wildcards will accept any class Stats with any param and Type Limited inside class
        //by Numbers
        System.out.println(sone.isSameC(stwo));//Generic method version
        System.out.println(sone.isSameD(stwo));//More complicated generic method.

    }

}
