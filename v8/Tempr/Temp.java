package v8.Tempr;

public class Temp {
    int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Temp(int high) {
        this.high = high;
    }


    boolean Same(Temp ob){

        return high == ob.getHigh();

    }
    boolean Bigger(Temp ob){

        return ob.getHigh() > high;

    }
    boolean Smaller(Temp ob){

        return ob.getHigh() < high;

    }
}
