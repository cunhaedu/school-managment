package com.cunhaedu.student_database.controller;

import com.cunhaedu.student_database.domain.School;
import com.cunhaedu.student_database.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping()
    public List<School> listAll() {
        return this.schoolService.list();
    }

    @PostMapping()
    public int create(@RequestBody School school) {
        return this.schoolService.create(school);
    }

    @PutMapping("/{id}")
    public void create(@PathVariable int id, @RequestBody School school) {
        this.schoolService.update(id, school);
    }
}
