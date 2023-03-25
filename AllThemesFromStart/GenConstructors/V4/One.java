package AllThemesFromStart.GenConstructors.V4;

public class One {
    private final double val;

    public <T extends Number> One(T val){
        this.val = val.doubleValue();
    }
    public double getVal(){
        return val;
    }

}
