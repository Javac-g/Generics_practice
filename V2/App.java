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
            System.out.print("]  ");
        }

    }

    static void show_XYZ(Map<? extends XYZ> object){

        System.out.println("\n---- [ 3 D ] ----");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z);
            System.out.print("]  ");
        }

    }

    static void show_XYZT(Map<? extends XYZT> object){

        System.out.println("\n---- [ 4 D ] ----");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t);
            System.out.print("]  ");
        }




    }

    public static void main(String...args){

        D2 = new XY[]{new XY(1, 2) , new XY(1,3)};
        D3 = new XYZ[]{new XYZ(1,2,3), new XYZ(1,2,4)};
        D4 = new XYZT[]{new XYZT(1,2,3,4), new XYZT(1,2,3,5)};

        Map<XY> xy = new Map<>(D2);
        Map<XYZ> xyz = new Map<>(D3);
        Map<XYZT> xyzt = new Map<>(D4);

        show_XY(xy);
        show_XYZ(xyz);
        show_XYZT(xyzt);


    }
}
