package com.github.seet61.codeRun.foobar;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    public static List test(List<Integer> parts) {
        List temp = new ArrayList();

        parts.forEach(entry -> {
            if (entry % 3 == 0 && entry % 5 == 0) {
                temp.add("foobaz");
            } else if (entry % 3 == 0) {
                temp.add("foo");
            } else if (entry % 5 == 0) {
                temp.add("bar");
            } else {
                temp.add(entry);;

            }
        });

        return temp;
    }
}
