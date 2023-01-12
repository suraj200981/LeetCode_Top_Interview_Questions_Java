package Easy.String;

public class DefangingIPAddress {

  public DefangingIPAddress(){

  }

  public String defangIPaddr(String address) {
    return address.replaceAll("[^0-9.]","").replaceAll("\\.","[.]");
  }


}
