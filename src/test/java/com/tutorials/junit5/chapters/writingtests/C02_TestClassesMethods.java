package com.tutorials.junit5.chapters.writingtests;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class C02_TestClassesMethods {
    static Logger logger = Logger.getLogger(C02_TestClassesMethods.class.getName());
    @BeforeAll
    static void initAll() {
        logger.info("In Before All");
    }

    @BeforeEach
    void init() {
        logger.info("In Before Each");
    }

    @Test
    void succeedingTest() {
        logger.info("In Test");
    }

    @Test
    void failingTest() {
        fail("a failing test");
        logger.info("In Test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @Test
    void abortedTest() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @AfterEach
    void tearDown() {
        logger.info("After Each");
    }

    @AfterAll
    static void tearDownAll() {
        logger.info("Tear down all");
    }

}
