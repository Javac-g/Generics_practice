package AllThemesFromStart.LimitedWilcards.V4;

public class XYZ extends XY{

    protected final int z;

    public XYZ(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public Integer getZ(){
        return z;
    }
}
