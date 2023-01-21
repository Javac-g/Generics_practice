package AllThemesFromStart.GenConstructors;

public class One {
    private double val;
    <T extends Number> One(T arg){
        val = arg.doubleValue();
    }
}
