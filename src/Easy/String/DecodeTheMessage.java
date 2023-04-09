package Easy.String;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {

  public String decodeMessage(String key, String message) {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    HashMap<String, String> mapping = new HashMap<>();
    int alphabetCount = 0;

    //map to create a new alphabet
    for (int x = 0; x <= key.length(); x++) {
      if (alphabetCount == alphabet.length()) {
        break;
      }
      if (String.valueOf(key.charAt(x)).matches("[a-zA-Z]+")) {
        mapping.put(String.valueOf(key.charAt(x)),
                String.valueOf(alphabet.charAt(alphabetCount++)));
        key = key.replaceAll(String.valueOf(key.charAt(x)), " ");
      } else {
      }
    }

    //decode message against new alphabet
    StringBuilder finalStr = new StringBuilder();
    for (int x = 0; x < message.length(); x++) {
      if (String.valueOf(message.charAt(x)).equals(" ")) {
        finalStr.append(" ");
      } else {
        finalStr.append(mapping.get(String.valueOf(message.charAt(x))));
      }
    }
    return finalStr.toString();
  }
}
