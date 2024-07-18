package com.github.seet61.codeRun.sort;

import java.util.Arrays;

public class Sort {
    public static int middle(int[] intArray) {
        Arrays.sort(intArray);
        return intArray[1];
    }
}
