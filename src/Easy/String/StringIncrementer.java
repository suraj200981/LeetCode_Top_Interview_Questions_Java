package Easy.String;

public class StringIncrementer {

  public static String incrementString(String str) {

    int lastChar=0;

    String finalStr="";

    if(!Character.isDigit(str.charAt(str.length()-1))){
      finalStr=str;
      finalStr+=1;
      return finalStr;
    }
    for (char c : str.toCharArray()){

      if(str.length()-1==lastChar && Character.isDigit(c)){
        finalStr += (char) Character.getNumericValue(c)+1;
      }
      if(!(str.length()-1==lastChar)) {
        finalStr = finalStr + c;
      }
      lastChar++;

    }
    return finalStr; // you code here
  }
}
