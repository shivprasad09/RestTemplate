package com.example.resttemplate.service;

import com.example.resttemplate.model.RequestPayload;
import com.example.resttemplate.model.ResponsePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Service class responsible for making REST API calls using {@link RestTemplate}.
 * This class encapsulates the logic for sending a POST request with a JSON payload
 * to an external API and processing the complex JSON response.
 *
 * <p>The service uses {@link RestTemplate} to perform HTTP operations and handles
 * the construction of the request, execution of the call, and processing of the response.</p>
 */
@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String API_URL = "https://example.com/api/endpoint";

    /**
     * Sends a POST request to the external API with the provided JSON payload
     * and processes the complex JSON response.
     *
     * <p>This method performs the following steps:
     * <ol>
     *   <li>Sets the HTTP headers to specify JSON content type.</li>
     *   <li>Creates an {@link HttpEntity} with the request payload and headers.</li>
     *   <li>Sends the POST request using {@link RestTemplate#exchange}.</li>
     *   <li>Processes the response and returns the deserialized {@link ResponsePayload}.</li>
     * </ol>
     * </p>
     *
     * @param requestPayload the JSON payload to send in the POST request
     * @return the deserialized response from the external API as a {@link ResponsePayload} object
     */
    public ResponsePayload sendPostRequest(RequestPayload requestPayload) {
        // Set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Create the HTTP entity
        HttpEntity<RequestPayload> requestEntity = new HttpEntity<>(requestPayload, headers);

        // Send POST request and process the response
        ResponseEntity<ResponsePayload> responseEntity = restTemplate.exchange(
                API_URL,
                HttpMethod.POST,
                requestEntity,
                ResponsePayload.class
        );

        return responseEntity.getBody();
    }
}