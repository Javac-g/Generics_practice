package V7;

import org.jetbrains.annotations.NotNull;



public class App {


    static void show_XY(@NotNull Map<? extends XY> object){

        System.out.println("--- [ 2 D ] ---");

        for (int i = 0; i <= object.array.length -1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y);
            System.out.print("] ");


        }


    }
    //Tell me what difference ?  between ( Map<? extends XYZ> object)  and  static<T extends xyz> show_XYZ(Map<T> object)
    static <T extends XYZ> void show_XYZ(@NotNull Map<T > object){

        System.out.println("\n--- [ 3 D ] ---");

        for (int i = 0; i <= object.array.length -1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z);
            System.out.print("] ");


        }
    }

    static void show_XYZT(@NotNull Map<? extends XYZT> object){

        System.out.println("\n--- [4 D] ---");
        for (int i = 0; i <= object.array.length-1; i++){
            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t);
            System.out.print("] ");
        }
    }

    public static void main(String...args){

        XY[] D2 = {new XY(1,2) , new XY(1,2)};
        XYZ[] D3 = {new XYZ(1,2,3), new XYZ(1,2,3)};
        XYZT[] D4 = {new XYZT(1,2,3,4) , new XYZT(1,2,3,4)};

        Map<XY> A = new Map<>(D2);
        Map<XYZ> B = new Map<>(D3);
        Map<XYZT> C = new Map<>(D4);

        show_XY(A);
        show_XYZ(B);
        show_XYZT(C);









    }
}
