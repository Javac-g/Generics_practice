package AllThemesFromStart.LimitedWilcards.V4;

public class Main {
    public static void showXY(Map<?> dataOb){ // Map with any T type , but in class T - upper Limit XY
        System.out.println("   ---   2 D   ---   ");
        for (int i = 0; i < dataOb.getData().length;i++){
            System.out.println("Coords: " + i);
            System.out.println(dataOb.getData()[i].getX());
            System.out.println(dataOb.getData()[i].getY());
        }
    }
    public static void showXYZ(Map<? extends XYZ> dataOb){// Upper Limit XYZ or subclass type T of Map
        System.out.println("   ---   3 D   ---   ");
        for (int j = 0;j < dataOb.getData().length;j++){
            System.out.println("Coords: " + j);
            System.out.println(dataOb.getData()[j].getX());
            System.out.println(dataOb.getData()[j].getY());
            System.out.println(dataOb.getData()[j].getZ());
        }
    }
    public static void showXYZT(Map<? extends XYZT> dataOb){//Upper Limit XYZT or subclass type T of Map
        System.out.println("   ---   4 D   ---   ");
        for (int k = 0;k < dataOb.getData().length;k++){
            System.out.println("Coords: " + k);
            System.out.println(dataOb.getData()[k].getX());
            System.out.println(dataOb.getData()[k].getY());
            System.out.println(dataOb.getData()[k].getZ());
            System.out.println(dataOb.getData()[k].getT());
        }
    }
    public static <V extends XYZT> void altShowXYZT(Map<V> dataOb){//Generic method alternative
        System.out.println("   ---  1 Alt 4 D   ---   ");
        for (int k = 0;k < dataOb.getData().length;k++){
            System.out.println("Coords: " + k);
            System.out.println(dataOb.getData()[k].getX());
            System.out.println(dataOb.getData()[k].getY());
            System.out.println(dataOb.getData()[k].getZ());
            System.out.println(dataOb.getData()[k].getT());
        }
    }
    public static <R extends XYZT,V extends Map<R>> void altShowXYZT2(V dataOb){//More complicated generic method
        System.out.println("   ---  2 Alt 4 D   ---   ");
        for (int k = 0;k < dataOb.getData().length;k++){
            System.out.println("Coords: " + k);
            System.out.println(dataOb.getData()[k].getX());
            System.out.println(dataOb.getData()[k].getY());
            System.out.println(dataOb.getData()[k].getZ());
            System.out.println(dataOb.getData()[k].getT());
        }
    }

    public static void main(String...args){
        //creating data for encapsulation in object Map

        XY[] coords2D = {new XY(12,13),new XY(14,15)}; // XY objects
        XYZ[] coords3D = {new XYZ(43,12,11),new XYZ(90,24,66)};// XYZ objects
        XYZT[] coords4D = {new XYZT(1,542,123,43),new XYZT(142,22,55,66)}; //XYZT objects

        //Encapsulation of data in Map

        Map<XY> dimensionOb2D = new Map<>(coords2D);
        Map<XYZ> dimensionOb3D = new Map<>(coords3D);//T[] data will be XYZ type or his subclass
        Map<XYZT> dimensionOb4D = new Map<>(coords4D);

        //Show coordinates
        showXY(dimensionOb2D);
        showXY(dimensionOb3D);
        showXY(dimensionOb4D);

        showXYZ(dimensionOb3D);
        showXYZ(dimensionOb4D);

        showXYZT(dimensionOb4D);

        Main.<XYZT>altShowXYZT(dimensionOb4D);//Old form

        Main.<XYZT,Map<XYZT>>altShowXYZT2(dimensionOb4D);// FInd this interesting to know
        altShowXYZT(dimensionOb4D);
        altShowXYZT2(dimensionOb4D);
    }
}
