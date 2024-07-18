package com.github.seet61.codeRun.nodNok;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodNokTest {

    @Test
    public void nod1() {
        int result = NodNok.nod(5, 10);
        System.out.println(String.valueOf(result));
    }
}