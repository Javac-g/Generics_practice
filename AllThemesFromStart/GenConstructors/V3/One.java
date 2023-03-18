package AllThemesFromStart.GenConstructors.V3;

public class One {
    private final double value;
    public <T extends Number> One(T value){
        this.value = value.doubleValue();
    }
    public void show(){
        System.out.println("Value: " + value);
    }
}
