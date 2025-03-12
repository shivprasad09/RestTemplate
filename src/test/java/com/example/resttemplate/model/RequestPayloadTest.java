package com.example.resttemplate.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test class for {@link RequestPayload}.
 * This class tests the getters and setters of the RequestPayload model.
 */
public class RequestPayloadTest {

    /**
     * Tests the getter and setter methods of {@link RequestPayload}.
     * Ensures that the values set using setters can be correctly retrieved using getters.
     */
    @Test
    public void testGettersAndSetters() {
        // Create an instance of RequestPayload
        RequestPayload requestPayload = new RequestPayload();

        // Set values using setters
        requestPayload.setName("John Doe");
        requestPayload.setAge(30);
        requestPayload.setEmail("john.doe@example.com");

        // Verify values using assertions
        assertEquals("John Doe", requestPayload.getName(), "Name should be John Doe");
        assertEquals(30, requestPayload.getAge(), "Age should be 30");
        assertEquals("john.doe@example.com", requestPayload.getEmail(), "Email should be john.doe@example.com");
    }
}