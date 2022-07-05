package com.ll.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void add() {
        int rs = 10 + 5;
        assertEquals(15, rs);
    }
}

/* 안되면 식 먼저 쓰기- 파일 세팅 키맵=이클리스로 바꿔서 적용하기
int rs = Calculator.add("10 + 20");

asserEquals();*/


