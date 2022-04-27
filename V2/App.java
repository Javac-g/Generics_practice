package V2;

public class App {

    static XY[] D2;
    static XYZ[] D3;
    static XYZT[] D4;
    static void show_XY(Map<? extends XY> object){

        System.out.println("---- [ 2 D ] ----");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.println("[");
            System.out.println(object.array[i].x + " ");
            System.out.println(object.array[i].y);
            System.out.println("]");
        }
    }
    public static void main(String...args){




    }
}
