package AllThemesFromStart.ExtendedTypes.V3;

public class MyAnother extends LimitClass implements LimitInterface,LimitInterfaceSecond{
    @Override
    public String first() {
        return "Hello";
    }

    @Override
    public int second() {
        return 0;
    }
}
