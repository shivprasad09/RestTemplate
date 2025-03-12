package com.example.resttemplate.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RequestPayloadTest {

    @Test
    public void testGettersAndSetters() {
        RequestPayload requestPayload = new RequestPayload();

        requestPayload.setName("John Doe");
        requestPayload.setAge(30);
        requestPayload.setEmail("john.doe@example.com");

        assertEquals("John Doe", requestPayload.getName());
        assertEquals(30, requestPayload.getAge());
        assertEquals("john.doe@example.com", requestPayload.getEmail());
    }
}