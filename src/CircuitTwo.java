public class CircuitTwo {

    public static String simulate(int a, int b){
        XOR xor = new XOR(a, b);
        AND and = new AND(a, b);

        return "S: " + xor.output() + " C: " + and.output();
    }
}


