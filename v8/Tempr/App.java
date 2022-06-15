package v8.Tempr;

public class App {

    static <T> Integer run(Tool<T> tool , T[] vals, T t){

        int c = 0;

        for (int i = 0; i <= vals.length-1; i++){

            if (tool.function(vals[i],t))c++;

        }

        return c;

    }
    public static void main(String...args){


        Temp[] days = {

                new Temp(10), new Temp(20), new Temp(30),
                new Temp(40), new Temp(50), new Temp(60),
                new Temp(70), new Temp(80), new Temp(90)
        };

        System.out.println("temp higer 40: " + run(Temp::Bigger,days,new Temp(40)));



    }
}
