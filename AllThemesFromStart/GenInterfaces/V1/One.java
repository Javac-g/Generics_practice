package AllThemesFromStart.GenInterfaces.V1;

public class One <T extends Comparable<T>> implements MinMax<T>{
    private T[] vals;

    public One(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length;i++){
            if (vals[i].compareTo(v) < 0){
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i =0; i < vals.length; i++){
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}
