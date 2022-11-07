package V10;

public class Main {
    static void secondDimension(Map<? extends XY> map){
        System.out.println("--------*-*-*-[ 2 D ]-*-*-*--------");
        for (int i = 0; i < map.coords.length ; i++){
            System.out.print(map.coords[i].x + "  " + map.coords[i].y + " ");
            System.out.println();
        }
        System.out.println("___________________________________");
    }
    static void thirdDimension(Map<? extends XYZ> map){
        System.out.println("--------*-*-*-[ 3 D ]-*-*-*--------");
        for (int i = 0; i < map.coords.length ; i++){
            System.out.print(map.coords[i].x + "  " + map.coords[i].y + " " + map.coords[i].z + "");
            System.out.println();
        }
        System.out.println("___________________________________");
    }
    static void fourthDimension(Map<? extends XYZT> map){
        System.out.println("--------*-*-*-[ 4 D ]-*-*-*--------");
        for (int i = 0; i < map.coords.length ; i++){
            System.out.print(map.coords[i].x + "  " + map.coords[i].y + " " + map.coords[i].z + " " + map.coords[i].t + " ");
            System.out.println();
        }
        System.out.println("___________________________________");
    }
    public static void main(String...helpMe){
        XY[] D2 = {new XY(1,2),new XY(3,4),new XY(5,6)};
        XYZ[] D3 = {new XYZ(1,2,3), new XYZ(4,5,6),new XYZ(7,8,9)};
        XYZT[] D4 = {new XYZT(1,2,3,4), new XYZT(5,6,7,8),new XYZT(9,10,11,12)};

        Map<XY>containerXY = new Map<>(D2);
        Map<XYZ> containerXYZ = new Map<>(D3);
        Map<XYZT> containerXYZT = new Map<>(D4);

        secondDimension(containerXY);
        thirdDimension(containerXYZ);
        fourthDimension(containerXYZT);

    }
}
