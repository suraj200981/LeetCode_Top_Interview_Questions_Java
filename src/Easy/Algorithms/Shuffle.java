package Easy.Algorithms;

/*1470. Shuffle the Array
Easy
Topics
Companies
Hint
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].



Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]


Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3*/


import java.util.ArrayList;

public class Shuffle {


  //this problem is all about finding the midpoint in the array and working from there.

  public int[] shuffle(int[] nums, int n) {
    int[] nums1 = new int[n];
    int[] nums2 = new int[n];
    int[] finalArray = new int[nums.length];

    ArrayList<Integer> arrayList = new ArrayList<>();
    int inc = 0;

    //fill nums1
    for (int x = 0; x < n; x++) {
      nums1[x] = nums[x];
      inc++;
    }
    //fill nums2
    for (int x = 0; x < n; x++) {
      nums2[x] = nums[inc];
      inc++;
    }
   // build the final nums array with the seperated arrays based on midpoint
    for (int x = 0; x < n; x++) {
      arrayList.add(nums1[x]);
      arrayList.add(nums2[x]);
    }
    for (int x = 0; x < nums.length; x++) {
      finalArray[x] = arrayList.get(x);
    }
    return finalArray;

  }
}
