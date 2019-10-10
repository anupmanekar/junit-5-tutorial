package com.tutorials.junit5.chapters.writingtests;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class C09_TestOrdering {

    @Test
    @Order(2)
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    @Order(1)
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }

}
