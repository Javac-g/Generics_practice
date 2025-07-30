package main.LimitedWilcards.V3;

public class Main {
    public static void show2(Map<?> ob){ //Will accept Map with any T but Map class has rule T extends XY
        System.out.println(" --- 2 D --- ");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print("X: " + ob.getCoords()[i].getX());
            System.out.print(" Y: " + ob.getCoords()[i].getY());
            System.out.println();
        }

    }
    public static void show3(Map<? extends XYZ> ob){ //Upper limit XYZ or subclass
        System.out.println(" --- 3 D --- ");
        for (int i = 0; i < ob.getCoords().length;i++){

            System.out.print("X: " + ob.getCoords()[i].getX());
            System.out.print(" Y: " + ob.getCoords()[i].getY());
            System.out.println(" Z: " + ob.getCoords()[i].getZ());
        }
    }
    public static void show4(Map<? extends XYZT> ob){// Upper Limit XYZT
        System.out.println(" --- 4 D --- ");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print("X: " + ob.getCoords()[i].getX() + " ");
            System.out.print("Y: " + ob.getCoords()[i].getY() + " ");
            System.out.print("Z: " + ob.getCoords()[i].getZ() + " ");
            System.out.println("T: " + ob.getCoords()[i].getT());
        }
    }
    public static  <V extends XYZT>  void show5(Map<V> ob){ //Alternative to wildcards
        System.out.println(" --- 4 D --- ");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print("X: " + ob.getCoords()[i].getX() + " ");
            System.out.print("Y: " + ob.getCoords()[i].getY() + " ");
            System.out.print("Z: " + ob.getCoords()[i].getZ() + " ");
            System.out.println("T: " + ob.getCoords()[i].getT());
        }
    }
    public static  <V extends XYZT,R extends Map<V>>  void show6(R ob){// More complicated and specific alternative
        System.out.println(" --- 4 D --- ");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print("X: " + ob.getCoords()[i].getX() + " ");
            System.out.print("Y: " + ob.getCoords()[i].getY() + " ");
            System.out.print("Z: " + ob.getCoords()[i].getZ() + " ");
            System.out.println("T: " + ob.getCoords()[i].getT());
        }
    }

    public static void main(String...args){

        XY[] secondDim = {new XY(1,2),new XY(9,3)};
        XYZ[] thirdDim = {new XYZ(4,2,5),new XYZ(8,9,3)};
        XYZT[] fourDim = {new XYZT(5,3,92,4),new XYZT(2,8,4,7)};

        Map<XY> dimenison2 = new Map<>(secondDim);
        Map<XYZ> dimension3 = new Map<>(thirdDim);
        Map<XYZT> dimension4 = new Map<>(fourDim);

        show2(dimenison2);
        show2(dimension3);
        show2(dimension3);

        show3(dimension3);
        show3(dimension4);

        show4(dimension4);
        show5(dimension4);
        show6(dimension4);
    }
}
