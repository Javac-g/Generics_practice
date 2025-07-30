package main.LimitedTypes.V4;

public class Two extends LimitClass implements LimitInterfOne,LimitInterfTwo{
    @Override
    public String one() {
        return "One";
    }

    @Override
    public Integer two() {
        return 2;
    }
}
