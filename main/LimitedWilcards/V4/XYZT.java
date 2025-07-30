package main.LimitedWilcards.V4;

public class XYZT extends XYZ {

    protected final Integer t;

    public XYZT(int x, int y,int z, int t){
        super(x,y,z);
        this.t = t;
    }
    public Integer getT(){
        return t;
    }
}
