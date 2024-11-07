package at.riedmann.camera.at.riedmann.camera.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.riedmann.camera.at.riedmann.camera.Camera;
import at.riedmann.camera.at.riedmann.camera.Lens;
import at.riedmann.camera.at.riedmann.camera.Producer;
import at.riedmann.camera.at.riedmann.camera.SDCard;

public class CameraTest {
    private Lens lens01;
    private Camera camera;
    private Producer canon;
    private SDCard sdCard01;

    @BeforeEach
    void tearUp() {
        canon = new Producer("canon", "USA");
        sdCard01 = new SDCard(8000);
        lens01 = new Lens(200);
        camera = new Camera(1080, 500, "black", Camera.Resolution.MEDIUM, canon, sdCard01, lens01);

    }

    @Test
    void testGetColour() {
        Assertions.assertEquals("black", camera.getColour());
    }

    @Test
    void testGetLens() {
        Assertions.assertEquals(lens01.getFocalLength(), camera.getLens().getFocalLength());
    }

    @Test
    void testGetPixel() {
        Assertions.assertTrue(camera.getPixel() >= 0);
    }

    @Test
    void testGetProducer() {
        Assertions.assertEquals(canon.getCountry(), camera.getProducer().getCountry());
    }

    @Test
    void testGetSdCard() {
        Assertions.assertEquals(sdCard01.getAvailableStorage(), camera.getSdCard().getAvailableStorage());
    }

    @Test
    void testGetWeight() {
        Assertions.assertTrue(camera.getWeight() >= 0);
    }

    @Test
    void testShowPhotos() {
        // ????
    }

    @Test
    void testTakePicture() {
        // ????
    }
}
