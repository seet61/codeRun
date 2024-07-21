package com.github.seet61.codeRun.select;

import com.github.seet61.codeRun.bubbles.BubbleSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SelectSortTest {

    @Test
    public void sort() {
        int[] testArr = new int[]{6, 3, 8, 2, 6, 9, 4, 11, 1};
        SelectSort.sort(testArr);
        List<Integer> list = Arrays.stream(testArr).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}