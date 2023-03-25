package AllThemesFromStart.GenInterfaces.V4;

public class Main {

    public static void main(String...args){
        Integer[] n1 = {13,41,51,12,31,44,92};
        Double[] n2 = {1.1, 2.2, 3.3, 4.4, 0.23,0.11};

        Stats<Integer> one = new Stats<>(n1);
        Stats<Double> two = new Stats<>(n2);

        System.out.println("One max: " + one.max());
        System.out.println("One min: " + one.min());

        System.out.println("Two max: " + two.max());
        System.out.println("Two min: " + two.min());
    }
}
