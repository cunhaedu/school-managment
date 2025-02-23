package com.cunhaedu.student_database.domain.user;

public enum UserRole {
    ADMIN("admin"),
    TEACHER("teacher"),
    STUDENT("student");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
