public class InitPrivateToPublic {
    private int a;
    /*@ ensures a == returnFive();
      @*/
    public InitPrivateToPublic() {
        a = returnFive();
    }

    /*@ ensures \result == 5; @*/
    private /*@ pure @*/ int returnFive() {
        return 5;
    }
}
