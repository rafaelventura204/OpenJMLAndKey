public class C2 {
    /*@ private exceptional_behavior
      @ requires true;
      @ signals (ArrayIndexOutOfBoundsException) true;
      @*/
    public int getZero(int[] a) {
        return a[-1];
    }
}
