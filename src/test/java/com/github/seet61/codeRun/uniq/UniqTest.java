package com.github.seet61.codeRun.uniq;

import org.junit.Before;
import org.junit.Test;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class UniqTest {
    @Test
    public void test1() throws IOException {
        List<String> parts = Arrays.asList("1 2 3 4 5".split(" "));
        int num = Uniq.test(parts);
        assertEquals(5, num);
    }

    @Test
    public void test2() throws IOException {
        List<String> parts = Arrays.asList("1 2 3 4 4".split(" "));
        int num = Uniq.test(parts);
        assertEquals(3, num);
    }

    @Test
    public void test3() throws IOException {
        List<String> parts = Arrays.asList("9 3 10 5 7 6 4 1 2 8".split(" "));
        int num = Uniq.test(parts);
        assertEquals(10, num);
    }
}