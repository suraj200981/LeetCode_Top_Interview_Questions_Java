package Easy;

public class ShuffleString {

  public ShuffleString(){

  }
  //"codeleet", indices = [4,5,6,7,0,2,1,3]
  public String restoreString(String s, int[] indices) {

   char[] finalCharArray = new char[s.length()];

   for(int x=0; x<s.length(); x++){
     finalCharArray[indices[x]] = s.charAt(x);
   }

   StringBuilder finalAnswer = new StringBuilder("");

   for(int x = 0;x<finalCharArray.length; x++){
     finalAnswer.append(finalCharArray[x]);
   }
    return String.valueOf(finalAnswer);
  }

}
