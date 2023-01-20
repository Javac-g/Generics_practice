package AllThemesFromStart;

public class MainTwo {
    public static void main(String...args){
        Integer[] inums = {1,2,3,4,5};
        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};

        One<Integer> one = new One<>(inums);
        One<Double> two = new One<>(dnums);

        if (one.sameAvg(two)){
            System.out.println("Equals");
        }else{
            System.out.println("Different");
        }
    }
}
