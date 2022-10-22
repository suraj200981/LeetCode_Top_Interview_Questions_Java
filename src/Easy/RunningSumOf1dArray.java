package Easy;

public class RunningSumOf1dArray {
  public RunningSumOf1dArray(){

  }

  public int[] runningSum(int[] nums) {

    int[] sums =  new int[nums.length];
    int totalSum=0;
    int count=1;

    if(nums.length == 0){
      return null;
    }else{
      for (int x = 0; x < count; x++) {
          totalSum+= nums[x];
          sums[x]+= totalSum;
          if(count!= nums.length){
            count++;
          }else {
            break;
          }
      }
      return sums;
    }
  }

  public void result (int[] nums){

    for(int x=0; x<nums.length; x++ ){
      System.out.print(" "+ nums[x]);
    }
  }
}
