package Easy.String;

import java.util.ArrayList;
import java.util.HashMap;

public class uniqueMorseRepresentations {

  public uniqueMorseRepresentations() {
  }



  public int uniqueMorseRepresentations(String[] words) {
    HashMap<Character, String> morseCodeAlphabetMap = new HashMap<Character, String>();


    morseCodeAlphabetMap.put('a', ".-");
    morseCodeAlphabetMap.put('b', "-...");
    morseCodeAlphabetMap.put('c', "-.-.");
    morseCodeAlphabetMap.put('d', "-..");
    morseCodeAlphabetMap.put('e', ".");
    morseCodeAlphabetMap.put('f', "..-.");
    morseCodeAlphabetMap.put('g', "--.");
    morseCodeAlphabetMap.put('h', "....");
    morseCodeAlphabetMap.put('i', "..");
    morseCodeAlphabetMap.put('j', ".---");
    morseCodeAlphabetMap.put('k', "-.-");
    morseCodeAlphabetMap.put('l', ".-..");
    morseCodeAlphabetMap.put('m', "--");
    morseCodeAlphabetMap.put('n', "-.");
    morseCodeAlphabetMap.put('o', "---");
    morseCodeAlphabetMap.put('p', ".--.");
    morseCodeAlphabetMap.put('q', "--.-");
    morseCodeAlphabetMap.put('r', ".-.");
    morseCodeAlphabetMap.put('s', "...");
    morseCodeAlphabetMap.put('t', "-");
    morseCodeAlphabetMap.put('u', "..-");
    morseCodeAlphabetMap.put('v', "...-");
    morseCodeAlphabetMap.put('w', ".--");
    morseCodeAlphabetMap.put('x', "-..-");
    morseCodeAlphabetMap.put('y', "-.--");
    morseCodeAlphabetMap.put('z', "--..");

    ArrayList<String> difference = new ArrayList<>();

    StringBuilder strBuild = new StringBuilder();

    ArrayList<String> dupFound = new ArrayList<>();

    for (int x = 0; x < words.length; x++) {

      //check each word
      for (int y = 0; y < words[x].length(); y++) {
        strBuild.append(morseCodeAlphabetMap.get(words[x].charAt(y)));
      }

      //store the differences in morse
      difference.add(String.valueOf(strBuild));
      strBuild.setLength(0);

    }

    int uniqueCount =0;

    if(difference.size()==1){
      uniqueCount++;
    }

  for(int x = 0; x<difference.size(); x++){

    for(int y=0; y<difference.size()-1;y++){

      System.out.println("Value in question: "+difference.get(x) + " compared to "+ difference.get(y));
      //found a duplicate
      if(difference.get(x).equals(difference.get(y))){
        if (dupFound.contains(difference.get(x))){
          break;
        }else {
          uniqueCount++;
          dupFound.add(difference.get(x));
          break;
        }
      }else{

        if (dupFound.contains(difference.get(x))){
          break;
        }else {
          uniqueCount++;
          dupFound.add(difference.get(x));
          break;
        }
      }
    }
  }


    return uniqueCount;
  }
}
