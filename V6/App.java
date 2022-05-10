package V6;

import org.jetbrains.annotations.NotNull;

public class App {


    static void show_XY(@NotNull Map<? extends XY> object){
        for (int i = 0; i <=object.values.length -1; i++){
            System.out.print(object.values[i].x + " ");
            System.out.print(object.values[i].y + " ");
        }
    }
    static void show_XYZ(@NotNull Map<? extends XYZ> object){
        for (int i = 0; i <=object.values.length -1; i++){
            System.out.print(object.values[i].x + " ");
            System.out.print(object.values[i].y + " ");
            System.out.print(object.values[i].z + " ");
        }
    }
    static void show_XYZT(@NotNull Map<? extends XYZT> object){
        for (int i = 0; i <=object.values.length -1; i++){
            System.out.print(object.values[i].x + " ");
            System.out.print(object.values[i].y + " ");
            System.out.print(object.values[i].z + " ");
            System.out.print(object.values[i].t + " ");
        }
    }
    public static void main(String...args){

        XY[] D2 = {new XY(1,2)};
        XYZ[] D3 = {new XYZ(1,2,3)};
        XYZT[] D4 = {new XYZT(1,2,3,4)};


        Map<XY> A = new Map<>(D2);
        Map<XYZ> B = new Map<>(D3);
        Map<XYZT> C = new Map<>(D4);

        show_XY(A);
        show_XYZ(B);
        show_XYZT(C);


    }
}
