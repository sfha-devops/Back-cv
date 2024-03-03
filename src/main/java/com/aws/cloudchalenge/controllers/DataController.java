package com.aws.cloudchalenge.controllers;

import com.aws.cloudchalenge.dtos.BackgroundElement;
import com.aws.cloudchalenge.dtos.ProfExperience;
import com.aws.cloudchalenge.dtos.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import com.aws.cloudchalenge.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("api/v1/data")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/person/{name}")
    public String getPerson(@PathVariable String name) {
        Map<String, Object> data = dataService.getPersonData(name);
        return convertToJsonString(data);
    }

    @GetMapping("/background/{name}")
    public String getBackground(@PathVariable String name) {
        List<BackgroundElement> background = dataService.getBackgroundData(name);
        return convertToJsonString(background);
    }

    @GetMapping("/skills/{name}")
    public String getSkills(@PathVariable String name) {
        List<String> skills = dataService.getSkillsData(name);
        return convertToJsonString(skills);
    }

    @GetMapping("/prof-experience/{name}")
    public String getProfExperience(@PathVariable String name) {
        List<ProfExperience> profExperiences = dataService.getProfExperienceData(name);
        return convertToJsonString(profExperiences);
    }

    @GetMapping("/certifs/{name}")
    public String getCertifications(@PathVariable String name) {
        List<ProfExperience> certifications = dataService.getCertificationsData(name);
        return convertToJsonString(certifications);
    }

    @GetMapping("/projects/{name}")
    public String getProjects(@PathVariable String name) {
        List<Project> projects = dataService.getProjectsData(name);
        return convertToJsonString(projects);
    }

    @GetMapping("/profile/{name}")
    public String getProfile(@PathVariable String name) {
        String profile = dataService.getProfileData(name);
        return convertToJsonString(profile);
    }

    private String convertToJsonString(Object data) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
