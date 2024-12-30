package com.cunhaedu.student_database.controller;

import com.cunhaedu.student_database.model.FederativeUnit;
import com.cunhaedu.student_database.service.FederativeUnitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/federative-unit")
public class FederativeUnitController {
    private final FederativeUnitService federativeUnitService;

    public FederativeUnitController(FederativeUnitService federativeUnitService) {
        this.federativeUnitService = federativeUnitService;
    }

    @GetMapping()
    public List<FederativeUnit> list() {
        return this.federativeUnitService.list();
    }
}
