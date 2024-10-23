package at.riedmann.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
  private double capacity;
  private double occupiedStorage;
  private double availableStorage;
  private List<String> photos = new ArrayList<>();

  public SDCard(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity() {
      return capacity;
  }
  public double getOccupiedStorage() {
    //loop through all photos and add their
    return this.occupiedStorage;
  }

  public double getAvailableStorage() {

      return this.availableStorage-this.occupiedStorage;
  }

  
}
