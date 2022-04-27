package V1;


public class App {

    static void show_XY(Map<? extends XY> object){

        System.out.println("--- [2D] ---");

        for(int i = 0; i <= object.array.length - 1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y);
            System.out.print("] , ");

        }

        System.out.println("\n------------");

    }
    static void show_XYZ(Map<? extends XYZ> object){

        System.out.println("--- [3D] ---");

        for(int i = 0 ; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z);
            System.out.print("] , ");

        }

        System.out.println("\n------------");

    }

    static void show_XYZT(Map<? extends XYZT> object){

        System.out.println("--- [4D] ---");

        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print("[");
            System.out.print(object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t);
            System.out.print("] , ");

        }

        System.out.println("\n------------");

    }



    public static void main(String...args){

        XY[] D2 = {new XY(1,2), new XY(1,2), new XY(1,2)};
        XYZ[] D3 = {new XYZ(1,2,3), new XYZ(1,2,3), new XYZ(1,2,3)};
        XYZT[] D4 = {new XYZT(1,2,3,4),new XYZT(1,2,3,4), new XYZT(1,2,3,4)};

        Map<XY> XY = new Map<>(D2);
        Map<XYZ> XYZ = new Map<>(D3);
        Map<XYZT> XYZT = new Map<>(D4);

        show_XY(XY);
        show_XYZ(XYZ);
        show_XYZT(XYZT);

    }
}
