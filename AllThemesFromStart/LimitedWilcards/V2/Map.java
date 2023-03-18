package AllThemesFromStart.LimitedWilcards.V2;

public class Map <T extends XY>{
    T[] dimensions;
    public Map(T[] dimensions){
        this.dimensions = dimensions;
    }
    public T[] getDimensions(){
        return dimensions;
    }

}
