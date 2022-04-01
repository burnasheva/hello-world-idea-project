package com.jetbrains.teamcity.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @BeforeEach
    void setUp() {
        System.out.println("Setup method call");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown method call");
    }

    @Test
    public void testMoodAnalysis() {
        System.out.println("Test method call");
        assertTrue(true);
    }

}