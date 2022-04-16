public class MainTwo {


    static void show_XY(Map<? extends XY> object){

        for(int i = 0 ; i <= object.arrWithOb.length-1;i++){

            System.out.print(object.arrWithOb[i].x + "  ");
            System.out.print(object.arrWithOb[i].y + "  ");

        }
        System.out.println("X Y");

    }
    static void show_XYZ(Map<? extends XYZ> object){

        for(int i = 0 ; i <= object.arrWithOb.length-1;i++){

            System.out.print(object.arrWithOb[i].x + "  ");
            System.out.print(object.arrWithOb[i].y + "  ");
            System.out.print(object.arrWithOb[i].z + "  ");

        }
        System.out.println("X Y Z");
    }

    static void show_XYZT(Map<? extends XYZT> object){

        for(int i =0; i <= object.arrWithOb.length-1;i++){

            System.out.print(object.arrWithOb[i].x + "  ");
            System.out.print(object.arrWithOb[i].y + "  ");
            System.out.print(object.arrWithOb[i].z + "  ");
            System.out.print(object.arrWithOb[i].t + "  ");

        }
        System.out.println("X Y Z T");
    }
    public static void main(String...args){


        XY[] xy = { new XY(11,22), new XY(33,44),new XY(55,66)};
        XYZ[] xyz = { new XYZ(11,22,33) , new XYZ(44,55,66) , new XYZ(77,88,99)};
        XYZT[] xyzt = {new XYZT(11,22,33,44),new XYZT(55,66,77,88), new XYZT(99,111,222,333)};

        Map<XY> D2 = new Map<>(xy);
        Map<XYZ> D3 = new Map<>(xyz);
        Map<XYZT> D4 = new Map<>(xyzt);

        show_XY(D2);
        show_XYZ(D3);
        show_XYZT(D4);



    }
}
