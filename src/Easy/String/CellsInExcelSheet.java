package Easy.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CellsInExcelSheet {
  public CellsInExcelSheet(){

  }
  public List<String> cellsInRange(String s) {

    HashMap<String, Integer> map = new HashMap<>();

    List<String> ls = new ArrayList<>();

    int count = 1;

    for (char ch = 'A'; ch <= 'Z'; ++ch) {
      map.put(String.valueOf(ch), count++);
    }

    String currentLetter = "";

    for (int col = map.get(s.substring(0, s.indexOf(":")).substring(0, 1)); col <= map.get(s.substring(s.indexOf(":") + 1).substring(0, 1)); col++) {

      currentLetter = (char) (col + 'a' - 1) + "";


      for (int rows = Integer.parseInt(s.substring(0, s.indexOf(":")).substring(1)); rows <= Integer.parseInt(s.substring(s.indexOf(
              ":") + 1).substring(1)); rows++) {

        ls.add(currentLetter.toUpperCase() + rows);

      }
    }

    return ls;
  }
}
