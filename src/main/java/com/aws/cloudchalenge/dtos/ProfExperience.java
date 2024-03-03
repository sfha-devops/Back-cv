package com.aws.cloudchalenge.dtos;

import java.util.List;

public class ProfExperience {
    private String title;
    private List<String> elements;

    public ProfExperience() {
    }

    public ProfExperience(String title, List<String> elements) {
        this.title = title;
        this.elements = elements;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }
}
