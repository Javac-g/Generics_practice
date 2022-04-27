package V2;

public class App {

    static XY[] D2;
    static XYZ[] D3;
    static XYZT[] D4;

    static void show_XY(Map<? extends XY> object){

        System.out.println("---- [ 2 D ] ----");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y);
            System.out.println("]");
        }
        System.out.println("-------------------");
    }

    static void show_XYZ(Map<? extends XYZ> object){

        System.out.println("---- [ 3 D ] ----");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.println(object.array[i].z);
            System.out.println("]");
        }
        System.out.println("-------------------");
    }

    public static void main(String...args){




    }
}
