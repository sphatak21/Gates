public class NAND {
    private final int inputOne;
    private final int inputTwo;
    public NAND(int one, int two){
        inputOne = one;
        inputTwo = two;
    }
    public int output(){
        if(inputOne * inputTwo == 1){
            return 0;
        }
        return 1;
    }
}
