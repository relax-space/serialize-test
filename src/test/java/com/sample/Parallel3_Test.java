package com.sample;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Tag("group3")
@Execution(ExecutionMode.CONCURRENT)
public class Parallel3_Test {

    @Test
    void test3A() {
        System.out.println(Thread.currentThread().getName() + " => test3A");
    }

    @Test
    void test3B() {
        System.out.println(Thread.currentThread().getName() + " => test3B");
    }

    @Test
    void test3C() {
        System.out.println(Thread.currentThread().getName() + " => test3C");
    }
}