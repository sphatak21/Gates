public class XOR {
    private final int inputOne;
    private final int inputTwo;
    public XOR(int one, int two){
        inputOne = one;
        inputTwo = two;
    }
    public int output(){
        if(inputOne == inputTwo){
            return 0;
        }
        return 1;
    }
}
