package com.tutorials.junit5.chapters.writingtests;

import example.util.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_BasicTest {

    @Test
    void addition() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(0, 2));
    }
}
