package com.example.resttemplate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for {@link RestTemplateApplication}.
 * This class contains unit tests to verify the context loading of the Spring Boot application.
 */
@SpringBootTest
class RestTemplateApplicationTests {

    /**
     * Test to verify that the Spring application context loads successfully.
     */
    @Test
    void contextLoads() {
        RestTemplateApplication application = new RestTemplateApplication();
        assertNotNull(application);
    }

}