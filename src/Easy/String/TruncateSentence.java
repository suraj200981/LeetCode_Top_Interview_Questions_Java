package Easy.String;

import java.util.ArrayList;

public class TruncateSentence {

  public TruncateSentence() {

  }

  public String truncateSentence(String s, int k) {

    s+=" ";


    ArrayList<String> words = new ArrayList<>();

    int beginning = 0;
    for (int x = 0; x < s.length(); x++) {
      if (Character.isSpaceChar(s.charAt(x))) {
        words.add(s.substring(beginning,x));
        x++;
        beginning=x;
      }
    }

    StringBuilder finalStr = new StringBuilder();

    //keep appending final string until k
    for (int x=0; x<k;x++){
      if(x==k-1){
        finalStr.append(words.get(x));

      }else {
        finalStr.append(words.get(x)).append(" ");
      }
    }


    return finalStr.toString();

  }
}
