package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result);  // 测试 2 + 3 是否等于 5
    }

    @Test
    public void testAddWithNegative() {
        App app = new App();
        int result = app.add(-1, 4);
        assertEquals(3, result);  // 测试 -1 + 4 是否等于 3
    }
}
