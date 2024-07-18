package com.github.seet61.codeRun.foobar;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void test1() {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(10)
                .collect(Collectors.toList());
        List result = Foo.test(numbers);
        System.out.println(result);
    }

    @Test
    public void test2() {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(20)
                .collect(Collectors.toList());
        List result = Foo.test(numbers);
        System.out.println(result);
    }

    @Test
    public void test3() {
        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
                .limit(50)
                .collect(Collectors.toList());
        List result = Foo.test(numbers);
        System.out.println(result);
    }
}