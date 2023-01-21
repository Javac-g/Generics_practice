package AllThemesFromStart.ExtendedMetasymbolArgs;

public class Map <T extends XY>{
    private T[] coords;

    public Map(T[] coords){
        this.coords = coords;
    }

    public T[] getCoords(){
        return coords;
    }

}
