package Easy;

import java.util.HashMap;

public class randsomNote {

  public boolean canConstruct(String ransomNote, String magazine) {


    HashMap<String, String> hm = new HashMap<>();

    hm.put(magazine, ransomNote);
    hm.put(ransomNote, magazine);

    System.out.println(hm.get(magazine)); // ransom note
    System.out.println(hm.get(ransomNote)); //magazine


    if (hm.get(magazine) == null || hm.get(ransomNote) == null || hm.get(magazine).equals("") || hm.get(ransomNote).equals("")) {
      return false;
    } else {
      //check which is bigger
      //create loop
      for (int x = 0; x < hm.get(ransomNote).length(); x++) {
        if (hm.get(ransomNote).charAt(x) == hm.get(magazine).charAt(x)) {
          return true;
        }
      }
      return false;
    }
  }
}





//    if(hm.get(magazine).contains(hm.get(ransomNote))){
//      return true;
//    }else{
//      return false;
//    }

