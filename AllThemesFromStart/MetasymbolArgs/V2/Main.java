package AllThemesFromStart.MetasymbolArgs.V2;

public class Main {
    public static void main(String...args){
        Integer[] n1 = {1,2,3,4,5};
        Double[] n2 = {1.1,2.2,3.3, 4.4,5.5};
        Stats<Integer> first = new Stats<>(n1);
        Stats<Double> second = new Stats<>(n2);

        //first.isSameAverage(second);
        System.out.println(first.isSameAverageMeta(second));
    }
}
