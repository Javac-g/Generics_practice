package main.LimitedTypes.V5;

import main.LimitedTypes.V5.LimitedByClassAndInterface.ArgumentClass;
import main.LimitedTypes.V5.LimitedByClassAndInterface.GenericImplementation;
import main.LimitedTypes.V5.LimitedByClassOnly.Stats;

public class Main {
    public static void one(){
        Stats<Integer> stats = new Stats<>(new Integer[]{1,2,3,4,5,6,7,8});
        System.out.println("Average: " + stats.average());
    }
    public static void main(String... args){
         //one();
        ArgumentClass one = new ArgumentClass();
        GenericImplementation<ArgumentClass> implementation = new GenericImplementation<>(one);
        implementation.show();


    }
}
