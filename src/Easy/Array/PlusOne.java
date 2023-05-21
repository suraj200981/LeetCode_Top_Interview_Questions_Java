package Easy.Array;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

  public int[] plusOne(int[] digits) {

    ArrayList<Integer> containerList = new ArrayList<Integer>();

    StringBuilder strVal = new StringBuilder("");
    for (int x = 0; x < digits.length; x++) {
      strVal.append(digits[x]);
    }

    //convert string to int and plus 1

    BigInteger bi = new BigInteger(String.valueOf(strVal));
    BigInteger resultStringInt = bi.add(new BigInteger(String.valueOf(1)));

    String resultString = String.valueOf(resultStringInt);


    for (int x = 0; x < resultString.length(); x++) {
      containerList.add(Integer.parseInt((String.valueOf(resultString.charAt(x)))));
    }

    int[] resultArr = new int[containerList.size()];
    for (int x = 0; x < containerList.size(); x++) {
      resultArr[x] = containerList.get(x);
    }

    return resultArr;
  }
}
