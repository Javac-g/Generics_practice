package AllThemesFromStart.GenInterfaces.V3;

public class Main {
    public static void main(String...args){
        Integer[] n1 = {11,111,22,5,1,9,34,62,98};
        Float[] n2 = {1.32F,2.21F,0.42F,1.51F};

        Stats<Integer> iob = new Stats<>(n1);
        Stats<Float> fob = new Stats<>(n2);

        System.out.println("Min: " + iob.min());
        System.out.println("Max: " + iob.max());

        System.out.println("Min: " + fob.min());
        System.out.println("Max: " + fob.max());
    }
}
