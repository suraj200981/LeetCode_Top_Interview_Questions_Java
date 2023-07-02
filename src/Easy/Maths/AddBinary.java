package Easy.Maths;

import java.math.BigInteger;

public class AddBinary {

  public String addBinary(String a, String b) {

    try{

      BigInteger binaryA = new BigInteger(a, 2);
      BigInteger binaryB = new BigInteger(b, 2);
      String result = "";

      result =binaryA.add(binaryB).toString(2);

      System.out.println(result);
      return result;

    }catch(NumberFormatException ex){
      System.out.println(ex);
    }
    return null;
  }
}
