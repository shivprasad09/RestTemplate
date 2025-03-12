package com.example.resttemplate.controller;

import com.example.resttemplate.model.RequestPayload;
import com.example.resttemplate.model.ResponsePayload;
import com.example.resttemplate.service.ApiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for {@link ApiController}.
 * This class contains unit tests to verify the functionality of the API controller.
 */
public class ApiControllerTest {

    private MockMvc mockMvc;

    @Mock
    private ApiService apiService;

    @InjectMocks
    private ApiController apiController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
    }

    /**
     * Test to verify the `/api/send-data` endpoint.
     */
    @Test
    public void testSendData() throws Exception {
        RequestPayload requestPayload = new RequestPayload();
        ResponsePayload responsePayload = new ResponsePayload();
        responsePayload.setStatus("success");
        responsePayload.setCode(200);

        when(apiService.sendPostRequest(any(RequestPayload.class))).thenReturn(responsePayload);

        mockMvc.perform(post("/api/send-data")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"someField\":\"someValue\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.status").value("success"))
                .andExpect(jsonPath("$.code").value(200));
    }
}