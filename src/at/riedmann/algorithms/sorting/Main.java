package at.riedmann.algorithms.sorting;

import at.riedmann.algorithms.dataGenerator.DataGenerator;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateDataArray(5, 0, 10);
        DataGenerator.printArray(data);
        BubbleSort bs = new BubbleSort();
        bs.sort(data);
        System.out.println("Sorted:");
        DataGenerator.printArray(data);
    }
}
