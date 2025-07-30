package main.LimitedWilcards.V3;

public class XYZT extends XYZ{
    protected int t;
    public XYZT(int x, int y,int z,int t){
        super(x,y,z);
        this.t = t;
    }
    public int getT(){
        return t;
    };
}
