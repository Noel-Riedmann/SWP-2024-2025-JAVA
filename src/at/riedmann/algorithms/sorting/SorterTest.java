package at.riedmann.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {
    public static List<Sorter> algorithms = new ArrayList<>();
    public static void addAlgorithms(Sorter sorter) {
        algorithms.add(sorter);
    }

    @BeforeAll
    static void start() {
        addAlgorithms(new BubbleSort());
        addAlgorithms(new SelectionSort());
        addAlgorithms(new InsertionSort());
    }

    @Test
    void testGetName() {
        for (Sorter sorter : algorithms) {
            Assertions.assertNotNull(sorter.getName());
        }
    }

    @Test
    void testSort() {
        int[] input = { 3, 2, 1 };
        int[] expectedOutput = { 1, 2, 3 };

        for (Sorter sorter : algorithms) {
            int[] data = input.clone();
            sorter.sort(data);
            Assertions.assertArrayEquals(expectedOutput, data);
        }
    }
}
