package com.example.resttemplate.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Configuration class for defining and providing a {@link RestTemplate} bean.
 * This class ensures that a single instance of {@link RestTemplate} is created
 * and managed by the Spring application context, making it available for dependency
 * injection throughout the application.
 *
 * <p>{@link RestTemplate} is a synchronous HTTP client used to communicate with
 * external RESTful APIs. This configuration centralizes its creation and configuration.</p>
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Creates and configures a {@link RestTemplate} bean.
     *
     * <p>This method defines a Spring-managed bean of type {@link RestTemplate}.
     * The returned instance can be injected into other components, such as services,
     * to perform HTTP requests to external APIs.</p>
     *
     * @return a new instance of {@link RestTemplate}
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}