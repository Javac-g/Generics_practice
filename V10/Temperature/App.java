package V10.Temperature;

public class App {
    public static   <T> Integer process(Tools<T> intf , T[] vals,T t){
        int count = 0;
        for (int i = 0; i < vals.length;i++){
            if (intf.tool(vals[i],t))count++;
        }
        return count;
    }
    public static void main(String... args){
        High[] days = {new High(8),new High(50),new High(90)};
        System.out.println("Days with temp higher 10: " + process(High::isHigher,days,new High(10)));
    }
}
