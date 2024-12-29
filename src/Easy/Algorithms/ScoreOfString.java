package Easy.Algorithms;

public class ScoreOfString {
  public int scoreOfString(String s) {
    int val = 0;
    for(int x=0; x<s.length(); x++){

      if(x!=s.length()-1) {
        int nextChar = x + 1;

        val += Math.abs(s.charAt(x) - s.charAt(nextChar));
      }
    }
    return val;
  }
}
