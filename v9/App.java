package v9;

public class App {
    static void show_XY(MAP<? extends XY> object){
        System.out.println(" --- [2 D] ---");
        for (int i = 0; i <= object.array.length; i++ ){
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
        }
        System.out.println("\n");

    }
    public static void main(String...args){







    }
}
