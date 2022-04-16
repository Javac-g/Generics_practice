public class Main_Three {

    public static void main(String...args){

        Integer[] num = {1,9,2,3,8,6,5,4,7};
        Character[] ch = {'a','w','q','b','z'};

        Five<Integer> Iob = new Five<>(num);
        Five<Character> Cob = new Five<>(ch);

        System.out.println("Min: " + Iob.min());
        System.out.println("Max: " + Iob.max());

        System.out.println("Min: " + Cob.min());
        System.out.println("Max: " + Cob.max());

    }
}
