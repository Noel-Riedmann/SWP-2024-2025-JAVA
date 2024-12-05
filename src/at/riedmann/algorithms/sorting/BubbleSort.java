package at.riedmann.algorithms.sorting;

public class BubbleSort implements Sorter {
/*
 * BubbleSort bringt in der 0. Itteration die höchste Zahl aus dem Array ganz ans Ende indem er Stelle für Stelle immer 2 Zahlen vergleicht und die höhere Zahl immer richtung ende Zeigt
 * In der 1. Itteration wird das gleiche dann mit der zweithöchsten Zahl gemacht wobei der letzte mögliche Vergleich ausgelassen wird weil man weiß das die letzte Zahl höher sein muss
 */

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

    @Override
    public String getName() {
        return "BubbleSort";
    }
}
