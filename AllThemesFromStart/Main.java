package AllThemesFromStart;

public class Main {
    public static void main(String...args){
        A<String> str = new A<>("Hello");
        str.showType();
        //Type sequrity
        B iob = new B(88);
        int v = (Integer) iob.getO();
        B strOb = new B("hello");
        String strstr = (String)strOb.getO();

        iob = strOb;
        v = (Integer) iob.getO();

    }
}
