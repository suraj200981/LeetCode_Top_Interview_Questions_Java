package Easy.Algorithms;

public class singleNumber {
  public singleNumber(){

  }

    public int singleNumberFunc(int[] nums) { // 2,2,1

    int singleNumber = 0;

    for (int x=0; x<nums.length; x++){
      for(int y=x+1; y<nums.length; y++){//2
        if (nums[x]==nums[y]){

        }
      }
    }

    return singleNumber;
    }
}
