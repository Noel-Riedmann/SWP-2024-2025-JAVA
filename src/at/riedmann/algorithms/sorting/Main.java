package at.riedmann.algorithms.sorting;

import at.riedmann.algorithms.dataGenerator.DataGenerator;

public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateDataArray(5, -10, 10);
        DataGenerator.printArray(data);
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        ss.sort(data);
        System.out.println("Sorted:");
        DataGenerator.printArray(data);
    }
}
