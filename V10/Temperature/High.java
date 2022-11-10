package V10.Temperature;

public class High {
    int temp;

    public High(int temp){
        this.temp = temp;
    }
    public boolean isHigher(High ob){
        return  temp > ob.temp;
    }
    public boolean isSmaller(High ob){
        return temp < ob.temp;
    }
}
