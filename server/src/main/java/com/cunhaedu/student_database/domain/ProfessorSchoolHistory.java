package com.cunhaedu.student_database.domain;

import java.time.LocalDate;
import java.util.List;

public class ProfessorSchoolHistory {

    private int id;
    private School school;
    private Professor professor;
    private List<Subject> taughtSubjects;
    private LocalDate startWorkingAt;
    private LocalDate stopWorkingAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getStartWorkingAt() {
        return startWorkingAt;
    }

    public void setStartWorkingAt(LocalDate startWorkingAt) {
        this.startWorkingAt = startWorkingAt;
    }

    public LocalDate getStopWorkingAt() {
        return stopWorkingAt;
    }

    public void setStopWorkingAt(LocalDate stopWorkingAt) {
        this.stopWorkingAt = stopWorkingAt;
    }

    public List<Subject> getTaughtSubjects() {
        return taughtSubjects;
    }

    public void setTaughtSubjects(List<Subject> taughtSubjects) {
        this.taughtSubjects = taughtSubjects;
    }
}
