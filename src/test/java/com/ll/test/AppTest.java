package com.ll.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void add() {
        int rs = Calculator.run("10 + 20");

        assertEquals(30, rs);
    }

    @Test
    public void addTwo() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }

    @Test
    public void addThree() {
        int rs = Calculator.run("10 + 10");

        assertEquals(20, rs);
    }

}



