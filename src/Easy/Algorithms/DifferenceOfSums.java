package Easy.Algorithms;

public class DifferenceOfSums {

  public int differenceOfSums(int n, int m) {

    //n = range value
    //m = divisible by value

    int nonDiv=0;
    int div=0;
    for(int x = 1; x<=n; x++){

      //sum the non divisible values
      if((double)x/m%1!=0){
        nonDiv += x;
      }else{
        //sum the divisible values
        div+=x;
      }
    }

    return nonDiv - div;
  }
}
