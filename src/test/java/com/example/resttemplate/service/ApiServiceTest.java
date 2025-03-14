package com.example.resttemplate.service;

import com.example.resttemplate.model.RequestPayload;
import com.example.resttemplate.model.ResponsePayload;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

/**
 * Test class for {@link ApiService}.
 * This class contains unit tests to verify the functionality of the API service.
 */
public class ApiServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ApiService apiService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test to verify the sendPostRequest method.
     */
    @Test
    public void testSendPostRequest() {
        RequestPayload requestPayload = new RequestPayload();
        ResponsePayload responsePayload = new ResponsePayload();
        responsePayload.setStatus("success");
        responsePayload.setCode(200);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<RequestPayload> requestEntity = new HttpEntity<>(requestPayload, headers);

        when(restTemplate.exchange(
                eq("https://example.com/api/endpoint"),
                eq(HttpMethod.POST),
                eq(requestEntity),
                eq(ResponsePayload.class)
        )).thenReturn(ResponseEntity.ok(responsePayload));

        ResponsePayload result = apiService.sendPostRequest(requestPayload);

        assertEquals("success", result.getStatus());
        assertEquals(200, result.getCode());
    }
}