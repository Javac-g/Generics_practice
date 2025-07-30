package main.LimitedTypes.V4;

public class Two extends LimitClass implements LimitInterfOne,LimitInterfTwo{
    @Override
    public String one() {
        return "ArgumentClass";
    }

    @Override
    public Integer two() {
        return 2;
    }
}
