package V10.Coordinates;

public class XYZT extends XYZ{
    int t;
    public XYZT(int x,int y, int z,int t){
        super(x,y,z);
        this.t = t;
    }
}
