package com.cunhaedu.student_database.domain.user;

public enum UserGender {
    MALE("M"),
    FEMALE("F");

    private final String gender;

    UserGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
