package at.riedmann.algorithms;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println( 10 + random.nextInt(100-10));
        }
    }
}
