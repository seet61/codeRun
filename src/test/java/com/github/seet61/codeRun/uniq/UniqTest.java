package com.github.seet61.codeRun.uniq;

import org.junit.Before;
import org.junit.Test;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class UniqTest {
    @Test
    public void test1() throws IOException {
        List<Integer> parts =
                Arrays.stream("1 2 3 4 5".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        assertEquals(5, Uniq.uniq(parts));
    }

    @Test
    public void test2() throws IOException {
        List<Integer> parts =
                Arrays.stream("1 2 3 4 4".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        assertEquals(3, Uniq.uniq(parts));
    }

    @Test
    public void test3() throws IOException {
        List<Integer> parts =
                Arrays.stream("9 3 10 5 7 6 4 1 2 8".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        assertEquals(10, Uniq.uniq(parts));
    }
}