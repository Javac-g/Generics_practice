package AllThemesFromStart.BridgeMethods;

public class Two extends One<String>{
    public Two(String str){
        super(str);
    }

    @Override
    public String getT() {
        return t;
    }

}
