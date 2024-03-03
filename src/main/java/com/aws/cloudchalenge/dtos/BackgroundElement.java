package com.aws.cloudchalenge.dtos;

public class BackgroundElement {
    private String element;
    private String description;

    // Constructors, getters, and setters
    public BackgroundElement() {}

    public BackgroundElement(String element, String description) {
        this.element = element;
        this.description = description;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
