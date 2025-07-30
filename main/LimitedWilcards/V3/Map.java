package main.LimitedWilcards.V3;

public class Map <T extends XY>{
    private final T[] coords;

    public Map(T[] coords){
        this.coords = coords;
    }

    public T[] getCoords(){
        return coords;
    }
}
