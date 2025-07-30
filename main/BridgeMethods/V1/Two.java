package main.BridgeMethods.V1;

public class Two extends One<String>{
    public Two(String str){
        super(str);
    }

    @Override
    public String getT() {
        return t;
    }

}
