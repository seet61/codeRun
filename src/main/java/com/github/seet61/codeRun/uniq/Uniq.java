package com.github.seet61.codeRun.uniq;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Uniq {

    public static int test(List<String> parts) throws IOException {
        List<String> temp = parts.stream()
                .filter(num -> Collections.frequency(parts, num) == 1)
                .collect(Collectors.toList());
        return temp.size();
    }
}
