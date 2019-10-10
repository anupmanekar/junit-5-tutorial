package com.tutorials.junit5.chapters.writingtests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class C06_DisablingTests {

    Logger logger = Logger.getLogger(C06_DisablingTests.class.getName());

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
        logger.info("My test is not disabled");
    }

    @Test
    void testWillBeExecuted() {
        logger.info("My test is not disabled");
    }
}
