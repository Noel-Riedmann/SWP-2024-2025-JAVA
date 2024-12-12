package at.riedmann.algorithms.sorting;

public class InsertionSort implements Sorter{
    //InsertionSort testet die Nummer an der stelle i und schaut dann von rechts nach links wo er diese einfügen Muss
    //Visual Showcase: https://youtu.be/kPRA0W1kECg?t=11

    @Override
    public int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }

        return data;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
