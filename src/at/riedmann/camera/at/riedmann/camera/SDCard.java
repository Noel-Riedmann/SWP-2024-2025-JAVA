package at.riedmann.camera.at.riedmann.camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
  private double capacity;
  private double occupiedStorage;
  private List<Photo> photos;

  public SDCard(double capacity) {
    this.capacity = capacity;
    this.occupiedStorage = 0;
    this.photos = new ArrayList<>();
  }

  public void savePicture(Photo photo) {
    if (capacity >= occupiedStorage + photo.getSize()) {
      this.photos.add(photo);
      this.occupiedStorage += photo.getSize();
    }
    else{
      System.out.println("SD-Card is full!");
    }
  }

  public double getCapacity() {
    return capacity;
  }

  public double getAvailableStorage() {
    return this.capacity - this.occupiedStorage;
  }

  public List<Photo> getPhotos() {
    return photos;
  }

}
