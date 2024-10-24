package at.riedmann.camera.at.riedmann.camera;
import java.time.LocalDateTime;

public class Camera {
    private double pixel;
    private double weight;
    private String colour;

    public enum Resolution {
        LOW,
        MEDIUM,
        HIGH
    };

    private Resolution resolution;
    private Producer producer;
    private SDCard sdCard;
    private Lens lens;
    private int photosTaken;

    public Camera(double pixel, double weight, String colour, Resolution resolution, Producer producer, SDCard sdCard,
            Lens lens) {
        this.pixel = pixel;
        this.weight = weight;
        this.colour = colour;
        this.producer = producer;
        this.sdCard = sdCard;
        this.lens = lens;
        this.resolution = resolution;
        this.photosTaken = 0;
    }

    public void takePicture() {
        this.photosTaken += 1;
        double size = 1;
        LocalDateTime date = LocalDateTime.now();
        switch (this.resolution) {
            case LOW:
                size = 1;
                break;
            case MEDIUM:
                size = 4;
                break;
            case HIGH:
                size = 8;
                break;

            default:
                break;
        }
        Photo photo = new Photo("picture-0" + this.photosTaken, date.toString(), size);
        this.sdCard.savePicture(photo);
        System.out.println("picture-0" + this.photosTaken + " taken!");
    }

    public void showPhotos() {
        for (int i = 0; i < this.sdCard.getPhotos().size(); i++) {
            System.out.println(this.sdCard.getPhotos().get(i).getName() +" "+ this.sdCard.getPhotos().get(i).getDate() +" "+ this.sdCard.getPhotos().get(i).getSize());
        }
    }

    public double getPixel() {
        return pixel;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public Producer getProducer() {
        return producer;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public Lens getLens() {
        return lens;
    }

}
