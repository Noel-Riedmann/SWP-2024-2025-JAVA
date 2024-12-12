package at.riedmann.algorithms.sorting;

public class SelectionSort implements Sorter {
    /*
     * SelectionSort wählt immer die kleinste Zahl und fügt diese in die neue Liste hinzu
     * Visual Showcase: https://youtu.be/kPRA0W1kECg
     */

    @Override
    public int[] sort(int[] data) {
        int[] sortedList = data; 
        for (int i = 0; i < data.length - 1; i++) {
            int leastIndex = i; 
            for (int j = i + 1; j < sortedList.length; j++) {
                if (sortedList[j] < sortedList[leastIndex]) {
                    leastIndex = j; 
                }
            }
            if (leastIndex != i) {
                int temp = sortedList[i];
                sortedList[i] = sortedList[leastIndex];
                sortedList[leastIndex] = temp;
            }
        }

        return sortedList; 
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }

}
