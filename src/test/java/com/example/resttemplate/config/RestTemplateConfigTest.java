package com.example.resttemplate.config;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for {@link RestTemplateConfig}.
 * This class contains unit tests to verify the configuration of the RestTemplate bean.
 */
public class RestTemplateConfigTest {

    /**
     * Test to verify that the RestTemplate bean is created and configured successfully.
     */
    @Test
    public void testRestTemplateBean() {
        RestTemplateConfig config = new RestTemplateConfig();
        RestTemplate restTemplate = config.restTemplate();
        assertNotNull(restTemplate, "RestTemplate bean should not be null");
    }
}