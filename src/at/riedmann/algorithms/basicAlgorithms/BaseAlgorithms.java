package at.riedmann.algorithms.basicAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class BaseAlgorithms {
    public static int[] revert(int[] data){
        int[] revertedData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            revertedData[i] = data[data.length - i - 1]; 
        }
        return revertedData;
    }

    public static int max(int[] data){
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if(data[i] >= max){
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data){
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if(data[i] <= min){
                min = data[i];
            }
        }
        return min;
    }
}
