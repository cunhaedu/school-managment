package com.cunhaedu.student_database.model;

import java.util.List;

public class Professor {

    private int id;
    private Person person;
    private School currentSchool;
    private List<ProfessorSchoolHistory> schoolsHistory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public School getCurrentSchool() {
        return currentSchool;
    }

    public void setCurrentSchool(School currentSchool) {
        this.currentSchool = currentSchool;
    }

    public List<ProfessorSchoolHistory> getSchoolsHistory() {
        return schoolsHistory;
    }

    public void setSchoolsHistory(List<ProfessorSchoolHistory> schoolsHistory) {
        this.schoolsHistory = schoolsHistory;
    }
}
