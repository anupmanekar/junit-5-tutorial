package com.tutorials.junit5.chapters.writingtests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
public class C08_Tagging {
    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

    @Test
    @Tag("accounts")
    void testingAccounts() {
    }
}
