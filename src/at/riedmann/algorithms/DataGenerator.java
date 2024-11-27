package at.riedmann.algorithms;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size){
        Random random = new Random();
        int[] array = {};
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int[] generateDataArray(int size, int min, int max){
        Random random = new Random();
        int[] array = {};
        for (int i = 0; i < size; i++) {
            array[i] = min + random.nextInt(max-min);
        }
        return array;
    }
}
