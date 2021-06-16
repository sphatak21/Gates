public class OR {
    private final int inputOne;
    private final int inputTwo;
    public OR(int one, int two){
        inputOne = one;
        inputTwo = two;
    }
    public int output(){
        if(inputOne + inputTwo >= 1){
            return 1;
        }
        return inputOne+inputTwo;

    }
}
