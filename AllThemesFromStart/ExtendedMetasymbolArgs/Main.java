package AllThemesFromStart.ExtendedMetasymbolArgs;

public class Main {
    public static void showXY(Map<? extends XY> ob){
        System.out.println("---[ 2D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.println(ob.getCoords()[i].x + " ");
            System.out.println(ob.getCoords()[i].y + " ");
        }
        System.out.println();
    }
    public static void showXYZ(Map<? extends XYZ> ob){
        System.out.println("---[ 3D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.println(ob.getCoords()[i].x + " ");
            System.out.println(ob.getCoords()[i].y + " ");
        }
        System.out.println();
    }
    public static void showXYZT(Map<? extends XYZT> ob){
        System.out.println("---[ 4D ]---");
        for (int i = 0; i < ob.getCoords().length;i++){
            System.out.println(ob.getCoords()[i].x + " ");
            System.out.println(ob.getCoords()[i].y + " ");
        }
        System.out.println();
    }

    public static void main(String...args){
        
    }
}
