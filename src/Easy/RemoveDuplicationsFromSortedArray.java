package Easy;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
*each unique element appears only once. The relative order of the elements should be kept the same.
*
* Since it is impossible to change the length of the array in some languages, you must instead have
* the result be placed in the first part of the array nums. More formally, if there are k elements
* after removing the duplicates, then the first k elements of nums should hold the final result.
* It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place
* with O(1) extra memory.

Custom Judge:*/
public class RemoveDuplicationsFromSortedArray {


    public RemoveDuplicationsFromSortedArray(){

    }
    //[1,1,2,2,2,3,3,4,4] example passing nums array
    //[0...]
    public int removeDuplicates(int[] nums){
        int pointer= 1; //pointer

        for(int x = 0; x<nums.length-1; x++){
            if (nums[x]!=nums[x+1]){
                nums[pointer] = nums[x+1];
                pointer++;
            }
        }

        for(int x= 0; x<pointer; x++){
            System.out.println(nums[x]);
        }
        return pointer;
    }
}
