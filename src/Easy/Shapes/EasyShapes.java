package Easy.Shapes;

public class EasyShapes {


  public void printSquare() {

    for (int x = 0; x < 4; x++) {
      System.out.println();
      for (int y = 0; y < 4; y++) {
        System.out.print("* ");
      }
    }
  }

  public void printRightAngledTriangle() {

    for (int x = 0; x < 4; x++) {
      System.out.println();
      for (int y = 0; y < x+1; y++) {
        System.out.print("* ");
      }
    }
  }
}
