package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumForSuccess() {
        assertEquals(4, main.sum(1, 3));
    }

    @Test
    void sumForFail() {
        assertNotEquals(2, main.sum(1, 1));
    }
}