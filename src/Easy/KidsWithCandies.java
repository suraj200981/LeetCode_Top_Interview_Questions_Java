package Easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
  public KidsWithCandies() {
  }

  /*There are n kids with candies. You are given an integer array candies,
  where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
  denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number of candies
among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.*/

  //candies each kid has is candies[i]


  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

    Boolean [] resultArray = new Boolean [candies.length];
    int biggestNumberInArray =0;
    //finding the biggest number in the array
    int x =0;
    while(true){
      if(x==candies.length){
        break;
      }
      if(candies[x]>biggestNumberInArray){
        biggestNumberInArray=candies[x];
        x++;
      }else{
        x++;
      }
    }
    for(int i = 0; i<candies.length; i++){
      if((candies[i]+extraCandies) >= biggestNumberInArray){
        resultArray[i] = true;
      }else{
        resultArray[i] = false;
      }
    }



    return (List<Boolean>) Arrays.asList(resultArray);
  }
}
