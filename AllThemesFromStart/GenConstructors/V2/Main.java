package AllThemesFromStart.GenConstructors.V2;

public class Main {

    public static void main(String...args){
        One a = new <Integer>One(234);
        One b = new <Float>One(1.23F);

        a.getSum();
        b.getSum();
    }
}
