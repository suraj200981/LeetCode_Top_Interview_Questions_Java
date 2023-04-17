package Easy.String;

import java.util.HashMap;

public class SortingTheSentence {

  public String sortSentence(String s) {

    int countOfCurrentWord=0;
    HashMap<String, String> wordsAndIndex = new HashMap<String, String>();

    for (int x=0; x<s.length(); x++){

      if(Character.isSpaceChar(s.charAt(x))){
        x++;
      }else {
        if (Character.isDigit(s.charAt(x))) {
            wordsAndIndex.put(s.);
        } else {
          countOfCurrentWord++;
        }
      }
    }

    return "";
  }
}
