package Easy.String;

public class MergeStringsAlternately {

  public MergeStringsAlternately() {

  }

  public String mergeAlternately(String word1, String word2) {

    int maxLength = Math.max(word1.length(), word2.length());


    StringBuilder strFinal = new StringBuilder();
    for (int x = 0; x < maxLength; x++) {
      if(word1.length()==x){
        strFinal.append(word2, x, word2.length());
        break;
      } else if (word2.length()==x) {
        strFinal.append(word1, x, word1.length());
        break;
      }else {
        strFinal.append(word1.charAt(x));
        strFinal.append(word2.charAt(x));
      }
    }

    return strFinal.toString();
  }
}
