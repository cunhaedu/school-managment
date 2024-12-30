package com.cunhaedu.student_database.model;

import java.util.List;

public class School {

    private int id;
    private String name;
    private String about;
    private String imageLink;
    private String address;
    private FederativeUnit federativeUnit;
    private String city;
    private String email;
    private String cellphone;
    private boolean isActive;
    private List<Person> responsible;
    private List<ProfessorSchoolHistory> professors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FederativeUnit getFederativeUnit() {
        return federativeUnit;
    }

    public void setFederativeUnit(FederativeUnit federativeUnit) {
        this.federativeUnit = federativeUnit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Person> getResponsible() {
        return responsible;
    }

    public void setResponsible(List<Person> responsible) {
        this.responsible = responsible;
    }

    public List<ProfessorSchoolHistory> getProfessors() {
        return professors;
    }

    public void setProfessors(List<ProfessorSchoolHistory> professors) {
        this.professors = professors;
    }
}
