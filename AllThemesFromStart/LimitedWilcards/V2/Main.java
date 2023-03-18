package AllThemesFromStart.LimitedWilcards.V2;

public class Main {
    public static void show2d(Map<? extends XY> object){
        System.out.println(" --- 2 D --- ");
        for (int i = 0 ; i < object.getDimensions().length;i++){
            System.out.println("Number: " + i);
            System.out.println("Coord X : " + object.getDimensions()[i].x);
            System.out.println("Coord Y : " + object.getDimensions()[i].y);

        }
        System.out.println();
    }
    public static void show3d(Map<? extends XYZ> object){
        System.out.println(" --- 3 D --- ");
        for (int i = 0 ; i < object.getDimensions().length;i++){
            System.out.println("Number: " + i);
            System.out.println("Coord X : " + object.getDimensions()[i].x);
            System.out.println("Coord Y : " + object.getDimensions()[i].y);
            System.out.println("Coord Z : " + object.getDimensions()[i].z);

        }
        System.out.println();
    }
    public static void show4d(Map<? extends XYZT> object){
        System.out.println(" --- 4 D --- ");
        for (int i = 0 ; i < object.getDimensions().length;i++){
            System.out.println("Number: " + i);
            System.out.println("Coord X : " + object.getDimensions()[i].x);
            System.out.println("Coord Y : " + object.getDimensions()[i].y);
            System.out.println("Coord Z : " + object.getDimensions()[i].z);
            System.out.println("Coord T : " + object.getDimensions()[i].t);

        }
        System.out.println();
    }
    public static void showAll(Map<? super XYZT> object){

        for (int i = 0 ; i < object.getDimensions().length;i++){
            System.out.println("Number: " + i);
            System.out.println("Coord X : " + object.getDimensions()[i].x);
            System.out.println("Coord Y : " + object.getDimensions()[i].y);
           // System.out.println("Coord Z : " + object.getDimensions()[i].z);// okay its excluding XYZT but where is z????



        }
        System.out.println();
    }
    public static void main(String...args){
        XY[] second = {new XY(1,2),new XY(3,4),new XY(5,6)};
        XYZ[] third = {new XYZ(1,2,3),new XYZ(4,5,6),new XYZ(7,8,9)};
        XYZT[] forth = {new XYZT(1,2,3,4),new XYZT(5,6,7,8),new XYZT(9,10,11,12)};

        Map<XY> D2 = new Map<>(second);
        Map<XYZ> D3 = new Map<>(third);
        Map<XYZT>D4 = new Map<>(forth);

        show2d(D2);
        show3d(D3);
        show4d(D4);



    }
}
