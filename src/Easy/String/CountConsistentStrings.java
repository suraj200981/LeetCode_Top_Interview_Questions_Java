package Easy.String;

public class CountConsistentStrings {
  public CountConsistentStrings() {
  }

  public int countConsistentStrings(String allowed, String[] words) {

    int totalCount = 0;

    boolean inConsistent = false;

    int x = 0;
    int y = 0;
    while (true) {

      if (x == words.length) {
        break;
      }
      //outer loop
      if (words[x].length() == y) {
        if (inConsistent) {
          inConsistent = false;
        } else {
          totalCount++;
        }
        x++;
        y = 0;
      } else {
        //inner loop
        if (allowed.contains(String.valueOf(words[x].charAt(y)))) {
          y++;
        } else {
          inConsistent = true;
          y++;
        }
      }

    }
    return totalCount;
  }
}
