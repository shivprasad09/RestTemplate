package com.example.resttemplate.controller;

import com.example.resttemplate.model.RequestPayload;
import com.example.resttemplate.model.ResponsePayload;
import com.example.resttemplate.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller responsible for exposing an endpoint to handle POST requests.
 * This class maps incoming HTTP requests to the appropriate service methods
 * for processing and returning responses.
 *
 * <p>The controller exposes a single endpoint, `/api/send-data`, which accepts
 * a JSON payload, delegates the request to the {@link ApiService}, and returns
 * the processed response.</p>
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    /**
     * Handles a POST request to the `/api/send-data` endpoint.
     *
     * <p>This method accepts a JSON payload in the request body, delegates the
     * processing to the {@link ApiService#sendPostRequest(RequestPayload)} method,
     * and returns the response from the external API.</p>
     *
     * @param requestPayload the JSON payload received in the request body
     * @return the processed response from the external API as a {@link ResponsePayload} object
     */
    @PostMapping("/send-data")
    public ResponsePayload sendData(@RequestBody RequestPayload requestPayload) {
        return apiService.sendPostRequest(requestPayload);
    }
}