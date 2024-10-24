package at.riedmann.camera.at.riedmann.camera;

public class App {
    public static void main(String[] args) {
        Producer canon = new Producer("canon", "USA");
        SDCard sdCard01 = new SDCard(8000);
        Lens lens01 = new Lens(200);
        Camera camera01 = new Camera(1080, 500, "black", Camera.Resolution.MEDIUM, canon, sdCard01, lens01);

        for (int i = 0; i < 10000; i++) {
            camera01.takePicture();

        }

        camera01.showPhotos();
    }
}
