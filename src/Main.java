
import Easy.Array.PlusOne;
import Easy.String.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        PlusOne program = new PlusOne();

        int[] nums = new int[]{1,2,3};

        int[] nums1 = new int[]{9,8,7,6,5,4,3,2,1,0};


        System.out.println("Output : "+ Arrays.toString(program.plusOne(nums1)));



    }
}