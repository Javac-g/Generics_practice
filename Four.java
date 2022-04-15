public class Four<T> {

    int temp;

    boolean isHigher(Four<?> object){

        return object.getTemp() > this.temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
