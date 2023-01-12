package Easy.String;

public class JewelsAndStones {
  public JewelsAndStones() {

  }

  public int numJewelsInStones(String jewels, String stones) {

    int x = 0;
    int y = 0;
    int count = 0;
    while (true) {

      if(x== jewels.length()){
        break;
      }
      if (y == stones.length()) {
        y=0;
        x++;
        if(x== jewels.length()){
          break;
        }
      }
      if (jewels.charAt(x) == stones.charAt(y)) {
        count++;
        y++;
      } else {
        y++;
      }


    }
    return count;
  }
}
