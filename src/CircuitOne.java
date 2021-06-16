public class CircuitOne {

    public static String simulate(int a, int b){

        NOT not1 = new NOT(a);
        NOT not2 = new NOT(b);

        AND and1 = new AND(b, not1.output());
        AND and2 = new AND(a, not2.output());

        OR or1 = new OR(and1.output(), and2.output());

        return Integer.toString(or1.output());
    }
}

