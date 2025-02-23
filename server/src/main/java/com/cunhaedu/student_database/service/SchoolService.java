package com.cunhaedu.student_database.service;

import com.cunhaedu.student_database.domain.School;
import com.cunhaedu.student_database.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> list() {
        return this.schoolRepository.list();
    }

    public int create(School school) {
        return this.schoolRepository.create(school);
    }

    public void update(int id, School school) {
        this.schoolRepository.update(id, school);
    }
}
