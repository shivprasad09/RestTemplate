package com.example.resttemplate.model;

import java.util.List;

/**
 * Represents a response payload containing status, code, and a list of details.
 * This class is used to encapsulate the response data returned by an API or service.
 */
public class ResponsePayload {
    private String status;
    private int code;
    private List<Detail> details;

    /**
     * Gets the status of the response.
     *
     * @return A string representing the status of the response.
     */
    public String getStatus() { return status; }

    /**
     * Sets the status of the response.
     *
     * @param status A string representing the status to be set.
     */
    public void setStatus(String status) { this.status = status; }

    /**
     * Gets the response code.
     *
     * @return An integer representing the response code.
     */
    public int getCode() { return code; }

    /**
     * Sets the response code.
     *
     * @param code An integer representing the response code to be set.
     */
    public void setCode(int code) { this.code = code; }

    /**
     * Gets the list of details associated with the response.
     *
     * @return A list of {@link Detail} objects.
     */
    public List<Detail> getDetails() { return details; }

    /**
     * Sets the list of details associated with the response.
     *
     * @param details A list of {@link Detail} objects to be set.
     */
    public void setDetails(List<Detail> details) { this.details = details; }

    /**
     * Represents a detail item in the response payload.
     * This nested class encapsulates the ID and description of a detail.
     */
    public static class Detail {
        private String id;
        private String description;

        /**
         * Gets the ID of the detail.
         *
         * @return A string representing the ID of the detail.
         */
        public String getId() { return id; }

        /**
         * Sets the ID of the detail.
         *
         * @param id A string representing the ID to be set.
         */
        public void setId(String id) { this.id = id; }

        /**
         * Gets the description of the detail.
         *
         * @return A string representing the description of the detail.
         */
        public String getDescription() { return description; }

        /**
         * Sets the description of the detail.
         *
         * @param description A string representing the description to be set.
         */
        public void setDescription(String description) { this.description = description; }
    }
}