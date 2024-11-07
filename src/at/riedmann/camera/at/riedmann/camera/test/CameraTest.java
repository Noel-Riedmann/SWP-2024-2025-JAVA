package at.riedmann.camera.at.riedmann.camera.test;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import at.riedmann.camera.at.riedmann.camera.Camera;
import at.riedmann.camera.at.riedmann.camera.Lens;

public class CameraTest {
    private Lens lens01;
    private Camera camera;

    @Before
    void tearUp(){
         lens01 = new Lens(200);
         camera = new Camera(0, 0, null, null, null, null, lens01)

    }

    @Test
    void testGetColour() {
        Assertions.assertEquals(camera.getColour(), camera.getColour());
    }

    @Test
    void testGetLens() {
        Assertions.assertEquals(lens01.getFocalLength(), camera.getLens().getFocalLength());
    }

    @Test
    void testGetPixel() {

    }

    @Test
    void testGetProducer() {

    }

    @Test
    void testGetSdCard() {

    }

    @Test
    void testGetWeight() {

    }

    @Test
    void testShowPhotos() {

    }

    @Test
    void testTakePicture() {

    }
}
