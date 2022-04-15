public class three<T extends Number> implements Tool<T> {
    T t;

    three(T t){

        this.t = t;

    }

    T getT(){
        return t;
    }

    public T func(T t){
        return t;
    }
}
