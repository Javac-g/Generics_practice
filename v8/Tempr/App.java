package v8.Tempr;

public class App {

    static <T> Integer run(Tool<T> tool , T[] vals, T t){
        int c = 0;

        for (int i = 0; i <= vals.length-1; i++){

            if (tool.function(vals[i],t))c++;

        }
        return c;
    }
}
