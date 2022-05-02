package V4.Maps;

public class App {
    static  void show_xy(Map<? extends XY> object){
        System.out.println("--- 2d ---");
        for(int i = 0; i <= object.array.length -1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");

        }
        System.out.println();


    }
    static  void show_xyz(Map<? extends XYZ> object){
        System.out.println("--- 3d ---");
        for(int i = 0; i <= object.array.length -1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");

        }
        System.out.println();


    }

    static  void show_xyzt(Map<? extends XYZT> object){
        System.out.println("--- 4d ---");
        for(int i = 0; i <= object.array.length -1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t + " ");

        }
        System.out.println();


    }
    public static void main(String...args){

        XY[] D2 = {new XY(1,2),new XY(1,2)};
        XYZ[] D3 = {new XYZ(1,2,3), new XYZ(1,2,3)};
        XYZT[] D4 = {new XYZT(1,2,3,4), new XYZT(1,2,3,4)};

        Map<XY> twoD = new Map<>(D2);
        Map<XYZ> threeD = new Map<>(D3);
        Map<XYZT> fourD = new Map<>(D4);

        show_xy(twoD);
        show_xyz(threeD);
        show_xyzt(fourD);







    }
}
