package Easy.Algorithms;

public class FindPermutationDifference {
  public int findPermutationDifference(String s, String t) {

    char [] charArrS = s.toCharArray();
    char [] charArrT = t.toCharArray();
    char currentChar;
    int count=0;
    for(int x=0; x<charArrS.length; x++){
      currentChar = charArrS[x];
      for (int y=0; y<charArrT.length; y++){
        if(currentChar==charArrT[y]){
          count+=Math.abs(x-y);
        }
      }
    }
    return count;
  }
}
