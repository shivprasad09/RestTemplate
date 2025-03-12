package com.example.resttemplate.model;
/**
 * Represents the payload for a POST request sent to an external API.
 * This class encapsulates the data fields required for the request, including
 * the name, age, and email of a user.
 */
public class RequestPayload {
    private String name;
    private int age;
    private String email;

    /**
     * Gets the name of the user.
     *
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the user.
     *
     * @return the age of the user
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the user.
     *
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the email of the user.
     *
     * @return the email of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user.
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}