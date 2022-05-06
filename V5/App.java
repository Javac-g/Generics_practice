package V5;

public class App {

    static void show_XY(Map<? extends XY> object){

        for (int i = 0; i <= object.values.length-1; i++){

            System.out.print(object.values[i].x + " ");

            System.out.print(object.values[i].y + " ");


        }

        System.out.println();
    }

    static void show_XYZ(Map<? extends XYZ> object){

        for (int i = 0; i <= object.values.length-1; i++){

            System.out.print(object.values[i].x + " ");

            System.out.print(object.values[i].y + " ");

            System.out.print(object.values[i].z + " ");


        }

        System.out.println();
    }


    static void show_XYZT(Map<? extends XYZT> object){

        for (int i = 0; i <= object.values.length-1; i++){

            System.out.print(object.values[i].x + " ");

            System.out.print(object.values[i].y + " ");

            System.out.print(object.values[i].z + " ");

            System.out.print(object.values[i].t + " ");
        }

        System.out.println();
    }



    public static void main(String...args){

        XY[] D2 = {new XY(1,2), new XY(1,2)};
        XYZ[] D3 = {new XYZ(1,2,3), new XYZ(1,2,3)};
        XYZT[] D4 = {new XYZT(1,2,3,4), new XYZT(1,2,3,4)};

        Map<XY> second = new Map<>(D2);
        Map<XYZ> third = new Map<>(D3);





    }
}
