package Hard;

public class HardShapes {

  public void printHollowPyramid(int n) {
    for (int x = 0; x < n; x++) { // do for n times
      System.out.println();
      for (int y = 0; y < n - x; y++) { // y spaces
        System.out.print(" ");
      }

      if (x == 0 || x == n - 1) {

        for (int k = 0; k < (x * 2) + 1; k++) { //k stars

          System.out.print("*");
        }
      } else {
        System.out.print("*");

        for (int k = 0; k <= (x * 2) - 2; k++) { //k stars

          System.out.print(" ");
        }
        System.out.print("*");
      }
    }
  }

  public void printCheckerboard(int n) {


    for (int x=0; x<n; x++){ //do n times

      System.out.println();
      for(int y = 0; y< n+1; y++){

        if(y %2 ==0){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
      for (int z=0; z<n+1; z++){
        if(z %2 ==0){
          System.out.print(" ");
        }else{
          System.out.print("*");
        }
      }
    }

  }


}
