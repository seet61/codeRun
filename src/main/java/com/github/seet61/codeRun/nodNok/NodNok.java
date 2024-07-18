package com.github.seet61.codeRun.nodNok;

public class NodNok {
    public static int nod(int first, int second) {
        return (second == 0) ? first : nod(second, first % second);
    }
}
