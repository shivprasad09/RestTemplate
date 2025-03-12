package com.example.resttemplate.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponsePayloadTest {

    @Test
    public void testGettersAndSetters() {
        ResponsePayload responsePayload = new ResponsePayload();
        responsePayload.setStatus("success");
        responsePayload.setCode(200);

        ResponsePayload.Detail detail = new ResponsePayload.Detail();
        detail.setId("1");
        detail.setDescription("Detail description");

        List<ResponsePayload.Detail> details = new ArrayList<>();
        details.add(detail);

        responsePayload.setDetails(details);

        assertEquals("success", responsePayload.getStatus());
        assertEquals(200, responsePayload.getCode());
        assertEquals(1, responsePayload.getDetails().size());
        assertEquals("1", responsePayload.getDetails().get(0).getId());
        assertEquals("Detail description", responsePayload.getDetails().get(0).getDescription());
    }
}