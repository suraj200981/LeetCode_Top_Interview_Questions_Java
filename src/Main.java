import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[] {0,2,1,5,3,4};
        BuildArrayFromPermutation program = new BuildArrayFromPermutation();
        System.out.println("Output: "+ Arrays.toString(program.buildArray(nums)));

    }
}