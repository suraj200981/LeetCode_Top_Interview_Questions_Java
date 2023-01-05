import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[] {1,2,3,1,1,3};
        NumberOfGoodPairs program = new NumberOfGoodPairs();
        System.out.println("Output: "+ program.numIdenticalPairsLinearSolution(nums));

    }
}