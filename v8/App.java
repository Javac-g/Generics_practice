package v8;

public class App {
    static void show_XY(Map<?extends xy> object){
        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.println(object.array[i].y + " ");

        }
        System.out.println();
    }

    static void show_XYZ(Map<?extends xyz> object){
        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.println(object.array[i].y + " ");
            System.out.println(object.array[i].z + " ");

        }
        System.out.println();
    }
    static void show_XYZT(Map<?extends xyzt> object){
        for (int i = 0; i <= object.array.length-1; i++){

            System.out.print(object.array[i].x + " ");
            System.out.println(object.array[i].y + " ");
            System.out.println(object.array[i].z + " ");
            System.out.println(object.array[i].t + " ");

        }
        System.out.println();
    }
    public static void main(String...args){



        xy[] two = {new xy(1,2), new xy(1,2), new xy(1,2)};
        xyz[] three = {new xyz(1,2,3) , new xyz(1,2,3), new xyz(1,2,3)};
        xyzt[] four = {new xyzt(1,2,3,4) , new xyzt(1,2,3,4), new xyzt(1,2,3,4)};

        Map<xy> XY = new Map<>(two);
        Map<xyz> XYZ = new Map<>(three);
        Map<xyzt> XYZT = new Map<>(four);

        show_XY(XY);
        show_XYZ(XYZ);
        show_XYZT(XYZT);








    }
}
