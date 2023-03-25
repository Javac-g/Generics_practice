package AllThemesFromStart.LimitedWilcards.V4;

public class Map <T extends XY>{
    private final T[] data;

    public Map(T[] data){
        this.data = data;
    }
    public T[] getData(){
        return data;
    }

}
