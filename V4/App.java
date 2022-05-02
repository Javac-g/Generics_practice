package V4;

public class App {



    static <T> Integer run(Tool<T> tool, T[] values, T t){
        int count = 0;

        for (int i = 0; i < values.length; i++){

            if(tool.function(values[i],t))count++;

        }
        return count;

    }
    public static void main(String...args){

        High[] days = {new High(10),new High(20),new High(30),
                       new High(40),new High(50),new High(60),
                       new High(70),new High(80),new High(90)
        } ;










    }
}
