public class InitPublic {
    private /*@ spec_public @*/ int a;
    /*@ public normal_behavior
      @ ensures a == 5;
      @*/
    public InitPublic() {
        a = returnFive();
    }
    /*@ ensures \result == 5; @*/
    private /*@ pure @*/ int returnFive(){
        return 5;
    }
}
