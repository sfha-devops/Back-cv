package com.aws.cloudchalenge.services;

import com.aws.cloudchalenge.dtos.BackgroundElement;
import com.aws.cloudchalenge.dtos.ProfExperience;
import com.aws.cloudchalenge.dtos.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {

    private final HashMap<String, List<String>> skills;
    private final HashMap<String, String> profiles;
    private final HashMap<String, List<ProfExperience>> prof_experiences;
    private final HashMap<String, List<ProfExperience>> certifs;

    private final HashMap<String, List<Project>> projects;

    private final HashMap<String, List<BackgroundElement>> backgrounds;
    private final HashMap<String, Map<String, Object>> people;

    public DataService() {
        skills = new HashMap<>();
        profiles = new HashMap<>();
        prof_experiences = new HashMap<>();
        certifs = new HashMap<>();
        backgrounds = new HashMap<>();
        people = new HashMap<>();
        projects = new HashMap<>();


        // Skills
        skills.put("Abdelmajid", List.of(
                "EC2, S3, CloudFront",
                "Spring, Laravel",
                "React, Angular",
                "Cassandra, MySQL",
                "Creating RESTful api",
                "Security : OAuth2",
                "Python, Java, C"
        ));


        skills.put("Soul", List.of(
                "java","c", "sql","python",
                "Linux","git","docker","terraform",
                "ec2, s3, vpc et iam", "kubernetes"
        ));


        skills.put("Hajar", List.of(
                "java","c", "sql","python",
                "Linux","git","docker","terraform",
                "ec2, s3, vpc et iam", "kubernetes"
        ));


        skills.put("Oumayma", List.of(
                "java","c", "sql","python",
                "Linux","git","docker","terraform",
                "ec2, s3, vpc et iam", "kubernetes"
        ));


        //profiles
        profiles.put("Abdelmajid", "As an engineer student at EMI and an IT Academy Formation Cell leader, I am deeply passionate about learning DevOps methodologies, particularly focusing on cloud automation, CI/CD. I am actively pursuing hands-on experience in setting up cloud infrastructure to learn deploying web solutions and analyzing data effectively.");

        profiles.put("Soul", "Étudiant en Génie Informatique à l'École Mohammadia des Ingénieurs, passionné par le cloud computing et le DevOps. Curieux et motivé, je cherche à résoudre les défis du cloud avec créativité et engagement. Prêt à contribuer à des projets innovants dans le domaine.");

        profiles.put("Hajar", "Étudiante en Génie Informatique à l'École Mohammadia des Ingénieurs, passionné par le cloud computing et le DevOps. Curieux et motivé, je cherche à résoudre les défis du cloud avec créativité et engagement. Prêt à contribuer à des projets innovants dans le domaine.");

        profiles.put("Oumayma", "Étudiante en Génie Informatique à l'École Mohammadia des Ingénieurs, passionné par le cloud computing et le DevOps. Curieux et motivé, je cherche à résoudre les défis du cloud avec créativité et engagement. Prêt à contribuer à des projets innovants dans le domaine.");


        //prof_experiences
        List<ProfExperience> profExperiences = new ArrayList<>();
        profExperiences.add(new ProfExperience("Project of the Internship : GM-Soft company 2023", new ArrayList<>()));
        profExperiences.add(new ProfExperience("Development of the GeoPark Mgoun Website :",
                List.of("Front-End of the client pages.", "Front-End of the admin part of the site.")));
        prof_experiences.put("Abdelmajid", profExperiences);

        List<ProfExperience> profExperiences2 = new ArrayList<>();
        profExperiences2.add(new ProfExperience("Project of the Internship : OCP company 2023", new ArrayList<>()));
        prof_experiences.put("Soul", profExperiences2);

        List<ProfExperience> profExperiences3 = new ArrayList<>();
        profExperiences3.add(new ProfExperience("Leader of IT Academy Club", new ArrayList<>()));
        profExperiences3.add(new ProfExperience("Chairperson of the Entrepreneurial Challenge Committee", new ArrayList<>()));
        prof_experiences.put("Hajar", profExperiences3);

        List<ProfExperience> profExperiences4 = new ArrayList<>();
        profExperiences4.add(new ProfExperience("ChairWoman at IEEE EMI Student Branch", new ArrayList<>()));
        profExperiences4.add(new ProfExperience("Full-stack Devoloper at 4D logiciels maroc", new ArrayList<>()));
        prof_experiences.put("Oumayma", profExperiences4);

        //certifs
        List<ProfExperience> certifications = new ArrayList<>();
        certifications.add(new ProfExperience("AWS Cloud Practitioner - Coursera", new ArrayList<>()));
        certifications.add(new ProfExperience("DataCamp certifications :",
                List.of("Data Analyst Professional 2023 - 2025",
                        "Data Analyst Associate 2023 - 2025",
                        "Data Scientist Associate 2023 - 2025",
                        "Data Engineer Associate 2023 - 2025")));

        certifs.put("Abdelmajid", certifications);

        List<ProfExperience> certifications2 = new ArrayList<>();
        certifications2.add(new ProfExperience("Kubernetes :",
                List.of("Certified Kubernetes Administrator (CKA) 2024 - 2027",
                        "CKA Certification Course - Certified Kubernetes Administrator",
                        "Data Scientist Associate 2023 - 2025",
                        "Data Engineer Associate 2023 - 2025"
                        )));
        certifs.put("Soul", certifications2);

        List<ProfExperience> certifications3 = new ArrayList<>();
        certifications3.add(new ProfExperience("Google Cloud certifications :",
                List.of("TensorFlow on Google Cloud", "Feature Engineering")));
        certifications3.add(new ProfExperience("IBM certifications :",
                List.of("Introduction To Devops and Cloud",
                        "Exploratory Data Analysis for Machine Learning")));

        certifs.put("Hajar", certifications3);

        List<ProfExperience> certifications4 = new ArrayList<>();
        certifications4.add(new ProfExperience("DataCamp Certifications :",
                List.of("CI/CD for machine learning",
                        "AWS Cloud technology and services"
                )));
        certifications4.add(new ProfExperience("DataCamp Certifications :",
                List.of("Aws Certifications : ",
                        "Devops ON AWS: Code, build, and test "
                )));
        certifs.put("Oumayma", certifications4);



        //Projects
        List<Project> project = new ArrayList<>();
        project.add(new Project("Cloud Resume Challenge :",
                "Deploying my resume on a web application hosted on AWS cloud architecture."));
        project.add(new Project("Academic Movie WebSite Project",
                "Developing and deploying the back and front end of an online movie store."));
        projects.put("Abdelmajid", project);

        List<Project> project2 = new ArrayList<>();
        project2.add(new Project("Développement d'un pipeline CI/CD pour une application à trois niveaux",
                "aws ec2 + aws ebs, jenkins, docker-compose et terraform"));
        project2.add(new Project("Application web de Gestion des ressources informatique de l'ocp",
                ""));
        project2.add(new Project("Application de Gestion des ticket derestaurant a l'EMI",
                ""));
        projects.put("Soul", project2);


        List<Project> project3 = new ArrayList<>();
        project3.add(new Project("Développement d'un pipeline CI/CD pour une application à trois niveaux",
                "aws ec2 + aws ebs, jenkins, docker-compose et terraform"));
        project3.add(new Project("Application web de Gestion de gestion de bibliothèque avec React js et backend de 4D logiciel",
                ""));
        project3.add(new Project("Application de Gestion de flux de cartes avec BanK of Africa groupe BMCE",
                ""));
        projects.put("Hajar", project3);

        List<Project> project4 = new ArrayList<>();
        project4.add(new Project("Resume Deploiyement :",
                "Deploying my resume on a web application hosted on AWS cloud architecture."));
        projects.put("Oumayma", project4);



        // Background
        List<BackgroundElement> background = new ArrayList<>();
        background.add(new BackgroundElement("École Mohammadia d'Ingénieurs", "Génie informatique"));
        background.add(new BackgroundElement("Classes Préparatoires", "Lycée Mohammed V, BENI MELLAL"));
        background.add(new BackgroundElement("Baccalauréat", "Science math"));
        backgrounds.put("Abdelmajid", background);


        List<BackgroundElement> background2 = new ArrayList<>();
        background2.add(new BackgroundElement("École Mohammadia d'Ingénieurs", "Génie informatique"));
        background2.add(new BackgroundElement("Classes Préparatoires", "Lycée Mohammed V, Zakoura"));
        background2.add(new BackgroundElement("Baccalauréat", "Science math A"));
        backgrounds.put("Soul", background2);


        List<BackgroundElement> background3 = new ArrayList<>();
        background3.add(new BackgroundElement("École Mohammadia d'Ingénieurs", "Génie informatique"));
        background3.add(new BackgroundElement("Classes Préparatoires", "Lycée Moulay Abdallah, Safi"));
        background3.add(new BackgroundElement("Baccalauréat Science math B", "Lycée Mohammed V, Essaouira"));
        backgrounds.put("Hajar", background3);


        List<BackgroundElement> background4 = new ArrayList<>();
        background4.add(new BackgroundElement("École Mohammadia d'Ingénieurs", "Génie informatique"));
        background4.add(new BackgroundElement("Classes Préparatoires", "Lycée Omar Ibn Abd Aziz, Oujda"));
        background4.add(new BackgroundElement("Baccalauréat Science math A", "Lycée El Hassan Dakhil, Guercif"));
        backgrounds.put("Oumayma", background4);


        // Profile
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Abdelmajid HAMDAOUY");
        data.put("job", "DEVOPS & DATA ENGINEER");
        data.put("location", "Rabat, Agdal");
        data.put("email", "abd.hou.2015@gmail.com");
        data.put("number", "+212623017881");
        data.put("linkdin", "Abdelmajid HAMDAOUY");
        people.put("Abdelmajid", data);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "Redouane SOUL");
        data2.put("job", "DEVOPS & DATA ENGINEER");
        data2.put("location", "Rabat, Agdal");
        data2.put("email", "soulreoduane@gmail.com");
        data2.put("number", "+212626134340");
        data2.put("linkdin", "Redouane soul");
        people.put("Soul", data2);


        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "Hajar FETTOUH");
        data3.put("job", "DevOpS & Cloud ENGINEER");
        data3.put("location", "Rabat, Agdal");
        data3.put("email", "hajarfettouh111@gmail.com");
        data3.put("number", "+212772068751");
        data3.put("linkdin", "hajar fettouh");
        people.put("Hajar", data3);


        Map<String, Object> data4 = new HashMap<>();
        data4.put("name", "Omayma ALLAM");
        data4.put("job", "DevOpS & Cloud ENGINEER");
        data4.put("location", "Rabat, Agdal");
        data4.put("email", "omayma.allam2003@gmail.com");
        data4.put("number", "+212678833223");
        data4.put("linkdin", "allam omayma");
        people.put("Oumayma", data4);



    }

    public Map<String, Object> getPersonData(String name) {
        return people.get(name);
    }

    public List<BackgroundElement> getBackgroundData(String name) {
        return backgrounds.get(name);
    }

    public List<String> getSkillsData(String name) {
        return skills.get(name);
    }

    public List<ProfExperience> getProfExperienceData(String name) {
        return prof_experiences.get(name);
    }

    public List<ProfExperience> getCertificationsData(String name) {
        return certifs.get(name);
    }

    public List<Project> getProjectsData(String name) {
        return projects.get(name);
    }

    public String getProfileData(String name) {
        return profiles.get(name);
    }
}
