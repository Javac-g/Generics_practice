package AllThemesFromStart.LimitedWilcards.V4;

public class Map <T extends XY>{
    //Can create Map only with XY or his subclass Type
    //Using this class for coordinates encapsulation in XY,XYZ,XYZT objects
    private final T[] data;

    public Map(T[] data){
        this.data = data;
    }
    public T[] getData(){
        return data;
    }

}
