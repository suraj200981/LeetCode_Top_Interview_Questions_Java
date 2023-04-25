package Easy.String;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckIfPanagram {

  public CheckIfPanagram(){

  }


  public boolean checkIfPangram(String sentence) {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    ArrayList<String> arrStr = new ArrayList<>();

    if(sentence.length()>=alphabet.length()) {


      int x = 0;
      int y = 0;
      int matchCount=0;
      while (true) {


        if(arrStr.size()==alphabet.length()){
          return true;
        }
         if (x == sentence.length()&&matchCount==alphabet.length()) {
          return true;
        }else if(x == sentence.length() && matchCount!=alphabet.length()){
          return false;
        }


        if (String.valueOf(sentence.charAt(x)).equals(String.valueOf(alphabet.charAt(y)))) {
          if(!arrStr.contains(String.valueOf(alphabet.charAt(y)))){
            arrStr.add(String.valueOf(alphabet.charAt(y)));
          }
          x++;
          y = 0;
          matchCount++;
        } else {
          y++;
        }

      }
    }
    return false;
  }
}
