public class Simulator {
    public static void main(String[] args){
        for(int i = 1; i < 3; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    String res;
                    if(i == 1){
                        res = CircuitOne.simulate(j, k);
                    }else {
                        res = CircuitTwo.simulate(j, k);
                    }
                    System.out.println("Output for Circuit " + i + " with A = " + j + " and B = " + k + " is: " + res);

                }
            }
        }


    }
}
