package AllThemesFromStart.LimitedTypes.V3;

public class Main {
    public static void main(String...args){

        Integer[] nums = {1,2,3,4,5};
        Double[] nums2 = {1.1, 2.2, 3.3, 4.4, 5.5};

        One<Integer> one = new One<>(nums);
        System.out.println("Average int: " + one.getAverage());

        One<Double> two = new One<>(nums2);
        System.out.println("Average double: " + two.getAverage());

        MyAnother ob = new MyAnother();
        MyClass<MyAnother> myClass = new MyClass<>(ob);
        myClass.show();

    }
}
