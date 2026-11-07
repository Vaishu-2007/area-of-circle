package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testRadiusFive() {
        assertEquals(
            78.5398,
            circle.calculateArea(5),
            0.0001
        );
    }

    @Test
    public void testRadiusOne() {
        assertEquals(
            Math.PI,
            circle.calculateArea(1),
            0.0001
        );
    }

    @Test
    public void testRadiusZero() {
        assertEquals(
            0,
            circle.calculateArea(0),
            0.0001
        );
    }

    @Test
    public void testDecimalRadius() {
        assertEquals(
            Math.PI * 6.25,
            circle.calculateArea(2.5),
            0.0001
        );
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(
            IllegalArgumentException.class,
            () -> circle.calculateArea(-5)
        );
    }
}