package AllThemesFromStart.GenConstructors;

public class One {
    private final double val;
    public <T extends Number>  One(T arg){
        val = arg.doubleValue();
    }

    public double getVal() {
        return val;
    }
}
