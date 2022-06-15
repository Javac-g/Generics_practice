package v9;

public class App {
    static void show_XY(MAP<? extends XY> object){
        System.out.println(" --- [2 D] ---");
        for (int i = 0; i <= object.array.length-1; i++ ){

            System.out.print("[" + object.array[i].x + " ");
            System.out.print(object.array[i].y + " ]");
        }
        System.out.println("\n");

    }
    static void show_XYZ(MAP<? extends XYZ> object){
        System.out.println(" --- [3 D] ---");
        for (int i = 0; i <= object.array.length-1; i++ ){
            System.out.print("[" + object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ]");
        }
        System.out.println("\n");

    }
    static void show_XYZT(MAP<? extends XYZT> object){
        System.out.println(" --- [4 D] ---");
        for (int i = 0; i <= object.array.length-1; i++ ){
            System.out.print("[" + object.array[i].x + " ");
            System.out.print(object.array[i].y + " ");
            System.out.print(object.array[i].z + " ");
            System.out.print(object.array[i].t + " ]");
        }
        System.out.println("\n");

    }
    public static void main(String...args){

        XY[] A = {new XY(1,2),new XY(2,1),new XY(2,2)};
        XYZ[] B = {new XYZ(1,2,3), new XYZ(3,2,3), new XYZ(3,3,3)};
        XYZT[] C = {new XYZT(1, 2,3,4), new XYZT(4,3,2,1), new XYZT(4,4,4,4)};

        MAP<XY> second = new MAP<>(A);
        MAP<XYZ> third = new MAP<>(B);
        MAP<XYZT> fourth = new MAP<>(C);

        show_XY(second);
        show_XYZ(third);
        show_XYZT(fourth);





    }
}
