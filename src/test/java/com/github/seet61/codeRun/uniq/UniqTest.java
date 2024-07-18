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
}