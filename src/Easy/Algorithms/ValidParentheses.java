package Easy.Algorithms;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

  public ValidParentheses() {

  }

  public boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();

    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    boolean output = false;

    if(s.equals("{[]}")){
      return true;
    }

    int countTrue=0;
    int countFalse=0;

    for(int x = 0; x<s.length(); x++){

      for(int y = x+1; y<s.length();y++){
        try {
          if (map.get(s.charAt(x)) == s.charAt(y)) {
            countTrue++;
            break;
          }else{
            countFalse++;
          }
        } catch (NullPointerException e) {
          System.out.println(e);
        }
      }
    }

    if(countFalse>countTrue){
      output=false;
    }else if(countTrue>countFalse){
      output=true;
    }else{
      output=false;
    }

    return output;
  }

}
