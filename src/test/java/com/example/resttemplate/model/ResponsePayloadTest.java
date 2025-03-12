package com.example.resttemplate.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test class for {@link ResponsePayload}.
 * This class verifies the correctness of getters and setters in the ResponsePayload model.
 */
public class ResponsePayloadTest {

    /**
     * Tests the getter and setter methods of {@link ResponsePayload}.
     * Ensures that the values set using setters can be correctly retrieved using getters.
     */
    @Test
    public void testGettersAndSetters() {
        // Create an instance of ResponsePayload
        ResponsePayload responsePayload = new ResponsePayload();
        responsePayload.setStatus("success");
        responsePayload.setCode(200);

        // Create and set a Detail instance
        ResponsePayload.Detail detail = new ResponsePayload.Detail();
        detail.setId("1");
        detail.setDescription("Detail description");

        // Add the detail to a list and set it in responsePayload
        List<ResponsePayload.Detail> details = new ArrayList<>();
        details.add(detail);
        responsePayload.setDetails(details);

        // Verify values using assertions
        assertEquals("success", responsePayload.getStatus(), "Status should be success");
        assertEquals(200, responsePayload.getCode(), "Code should be 200");
        assertEquals(1, responsePayload.getDetails().size(), "Details list should have one element");
        assertEquals("1", responsePayload.getDetails().get(0).getId(), "Detail ID should be 1");
        assertEquals("Detail description", responsePayload.getDetails().get(0).getDescription(), "Detail description should match");
    }
}
