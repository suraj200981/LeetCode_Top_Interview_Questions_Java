import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[] {8,1,2,2,3};
        SmallerNumbersThanCurrent program = new SmallerNumbersThanCurrent();
        System.out.println("Output: "+ Arrays.toString(program.smallerNumbersThanCurrentLinearSolution(nums)));

    }
}