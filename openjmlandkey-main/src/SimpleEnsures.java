public class SimpleEnsures {
    //@ requires a.length >= 0;
    //@ ensures \result == a[0];
    public int fist(int[] a) {
        return a[0];
    }
}
