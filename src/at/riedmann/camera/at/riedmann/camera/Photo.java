package at.riedmann.camera.at.riedmann.camera;

public class Photo {
    private String name;
    private String date;
    private Double size;

    public Photo(String name, String date, Double size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public Double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
