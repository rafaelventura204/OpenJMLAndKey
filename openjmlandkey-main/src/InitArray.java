public class InitArray {
    private int[] a;
    InitArray() {
        //a = new int[0]; missing
    }
    /*@ ensures \result >= 0; @*/
    public int getLength() {
        return a.length;
    }
}
