package com.github.seet61.codeRun.uniq;


import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Uniq {
    public static long uniq(List<Integer> parts) {
        return parts.stream()
                .filter(num -> Collections.frequency(parts, num) == 1)
                .count();
    }
}
