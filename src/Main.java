import Easy.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[] {0,1,2,3,4};
        int [] index = new int[] {0,1,2,2,1};

        CreateTargetArray program = new CreateTargetArray();
        System.out.println("Output: "+ Arrays.toString(program.createTargetArray(nums, index)));

    }
}