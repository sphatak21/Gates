public class XOR {
    private final int inputOne;
    private final int inputTwo;
    public XOR(int one, int two){
        inputOne = one;
        inputTwo = two;
    }
    public int output(){
        return ((1 - inputOne) * inputTwo) + ((1-inputTwo) * inputOne);
    }
}
