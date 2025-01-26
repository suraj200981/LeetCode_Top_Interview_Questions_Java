package Medium;

public class MediumShapes {

  public void printPyramid() {


    int starsToSkip = 0;
    for (int x = 0; x < 4; x++) {
      System.out.println();
      for (int y = 0; y < 3 - x; y++) {
        System.out.print(" ");
      }
      for (int k = 0; k < (x * 2) + 1; k++) {

        System.out.print("*");
      }
    }
  }
}
