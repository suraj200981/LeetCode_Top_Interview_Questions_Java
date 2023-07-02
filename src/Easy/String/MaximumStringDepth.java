package Easy.String;

import java.util.HashMap;

public class MaximumStringDepth {


//Input: s = "(1+(2*3)+((8)/4))+1"
  public int maxDepth(String s) {

    HashMap<String, String> hmForParentheses = new HashMap<String, String>();

    hmForParentheses.put("(", ")");


    for (int x = 0; x < s.length(); x++) {
      if(String.valueOf(s.charAt(x)).equals("(") || String.valueOf(s.charAt(x)).equals(")")){
        x++;
        continue;
      }else {
        System.out.println(s.charAt(x));//1
        for (int y = 0; y < s.length(); y++) {
          
        }
      }
    }

    return 0;
  }

}
