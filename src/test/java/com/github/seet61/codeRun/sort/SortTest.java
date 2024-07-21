package com.github.seet61.codeRun.sort;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void middle1() {
        int[] array  = new int[]{1, 2, 3};
        int result = Sort.middle(array);
        System.out.println(String.valueOf(result));
    }

    @Test
    public void middle2() {
        int[] array  = new int[]{1000, -1000, 0};
        int result = Sort.middle(array);
        System.out.println(String.valueOf(result));
    }

    @Test
    public void middle3() {
        int[] array  = new int[]{3, 1, 3};
        int result = Sort.middle(array);
        System.out.println(String.valueOf(result));
    }

    @Test
    public void middle4() {
        String temp = "3 1 3";
        int[] array = Stream.of(temp.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = Sort.middle(array);
        System.out.println(String.valueOf(result));
    }
}