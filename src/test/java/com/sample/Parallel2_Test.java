package com.sample;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Tag("group2")
@Execution(ExecutionMode.CONCURRENT)
public class Parallel2_Test {

    @Test
    void test2A() {
        System.out.println(Thread.currentThread().getName() + " => test2A");
    }

    @Test
    void test2B() {
        System.out.println(Thread.currentThread().getName() + " => test2B");
    }

    @Test
    void test2C() {
        System.out.println(Thread.currentThread().getName() + " => test2C");
    }
}