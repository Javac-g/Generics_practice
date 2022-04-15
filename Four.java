public class Four<T> {

    T temp;
    Four(T temp){
        this.temp = temp;
    }
    boolean isHigher(Four<?> object){

        return temp.equals(object.getTemp());
    }

    public T getTemp() {
        return temp;
    }


}
