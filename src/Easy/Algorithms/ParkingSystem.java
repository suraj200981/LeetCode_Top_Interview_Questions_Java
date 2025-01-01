package Easy.Algorithms;

import java.util.HashMap;

public class ParkingSystem {

  HashMap<Integer, Integer> trackParking = new HashMap<Integer, Integer>();


  public ParkingSystem(int big, int medium, int small) {
    this.trackParking.put(1, big);
    this.trackParking.put(2, medium);
    this.trackParking.put(3, small);
  }

  public boolean addCar(int carType) {
    if(trackParking.get(carType)!=0){
      trackParking.put(carType,  trackParking.get(carType)-1);
      return true;
    }
    return false;
  }
}
