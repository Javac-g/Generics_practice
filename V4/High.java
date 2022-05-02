package V4;

public class High {

    int temp;

    High(int temp){

        this.temp = temp;

    }

    boolean isSame(High object){

        return temp == object.getTemp();


    }
    boolean isBigger(High object){

        return temp < object.getTemp();

    }
    boolean isSmaller(High object){

        return temp > object.getTemp();

    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
