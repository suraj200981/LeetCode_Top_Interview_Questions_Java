package Easy.Algorithms;

import java.util.HashMap;

public class RomanToInt {

  public RomanToInt(){

  }


  public int romanToInt(String s) {

    HashMap<String, Integer> romanNumerals = new HashMap<String, Integer>();


    romanNumerals.put("I", 1);
    romanNumerals.put("V", 5);
    romanNumerals.put("X", 10);
    romanNumerals.put("L", 50);
    romanNumerals.put("C", 100);
    romanNumerals.put("D", 500);
    romanNumerals.put("M", 1000);

    //special combos
    romanNumerals.put("IV", 4);
    romanNumerals.put("IX", 9);
    romanNumerals.put("XL", 40);
    romanNumerals.put("XC", 90);
    romanNumerals.put("CD", 400);
    romanNumerals.put("CM", 900);


    StringBuilder currentPattern = new StringBuilder();

int x=0;
int y=0;

/*There are six instances where we required subtraction:

I can be placed before V (5) and X to make 4 and 9.
X can be placed before L (50) and C to make 40 and 90.
C can be placed before D (500) and M to make 400 and 900.*/

int currentTotal= 0;
   while(true){

     if(x== s.length()){
       break;
     }else {
       if(x!=s.length()-1) {
         if ((s.charAt(x) == 'I' && s.charAt(x + 1) == 'V') && x != toString().length() - 1) {
           currentTotal += romanNumerals.get("IV");
           x+=2;
         } else if (s.charAt(x) == 'I' && s.charAt(x + 1) == 'X') {
           currentTotal += romanNumerals.get("IX");
           x+=2;
         } else if (s.charAt(x) == 'X' && s.charAt(x + 1) == 'L') {
           currentTotal += romanNumerals.get("XL");
           x+=2;
         } else if (s.charAt(x) == 'X' && s.charAt(x + 1) == 'C') {
           currentTotal += romanNumerals.get("XC");
           x+=2;
         } else if (s.charAt(x) == 'C' && s.charAt(x + 1) == 'D') {
           currentTotal += romanNumerals.get("CD");
           x+=2;
         } else if (s.charAt(x) == 'C' && s.charAt(x + 1) == 'M') {
           currentTotal += romanNumerals.get("CM");
           x+=2;
         }
         else {
           currentTotal += romanNumerals.get(String.valueOf(s.charAt(x)));
           x++;
         }
       }
       else {
         currentTotal += romanNumerals.get(String.valueOf(s.charAt(x)));
         x++;
       }
     }



   }

    System.out.println();
    return currentTotal;
  }

}
