package AllThemesFromStart.LimitedWilcards.V1;

public class Main {
    public static void showXY(Map<?> ob){
        System.out.println("---[ 2D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print(ob.getCoords()[i].x + " ");
            System.out.print(ob.getCoords()[i].y + " ");
        }
        System.out.println();
    }
    public static void showXYZ(Map<? extends XYZ> ob){
        System.out.println("---[ 3D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print(ob.getCoords()[i].x + " ");
            System.out.print(ob.getCoords()[i].y + " ");
            System.out.print(ob.getCoords()[i].z + " ");
        }
        System.out.println();
    }
    public static void showXYZT(Map<? extends XYZT> ob){
        System.out.println("---[ 4D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.print(ob.getCoords()[i].x + " ");
            System.out.print(ob.getCoords()[i].y + " ");
            System.out.print(ob.getCoords()[i].z + " ");
            System.out.print(ob.getCoords()[i].t + " ");
        }
        System.out.println();
    }

    public static void main(String...args){
        XY[] secondDim = {new XY(1,2),new XY(1,2),new XY(1,2)};
        XYZ[] thirdDim = {new XYZ(1,2,3),new XYZ(1,2,3),new XYZ(1,2,3)};
        XYZT[] fourthDim = {new XYZT(1,2,3,4),new XYZT(1,2,3,4),new XYZT(1,2,3,4)};

        Map<XY> xyMap = new Map<>(secondDim);
        Map<XYZ> xyzMap = new Map<>(thirdDim);
        Map<XYZT> xyztMap = new Map<>(fourthDim);


        showXY(xyMap);
        showXY(xyzMap);
        showXY(xyztMap);

        showXYZ(xyzMap);
        showXYZ(xyztMap);

        showXYZT(xyztMap);
    }
}
