public class SimpleContract {

    /*@ requires d > 0 && v > 0;
      @ ensures v - d <= \result && \result <= v;
      @*/
    public static int round(int v, int d){
        return v - (v % d); //return d
    }
}