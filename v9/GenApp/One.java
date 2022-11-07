package v9.GenApp;

public class One <T>{

    T object;

    One(T object){

        this.object = object;

    }
    public T getObject(){

        return object;

    }

    public void  show(){
        System.out.println(" " + object.getClass());
        System.out.println(" " + object.getClass().getName());
    }


}
