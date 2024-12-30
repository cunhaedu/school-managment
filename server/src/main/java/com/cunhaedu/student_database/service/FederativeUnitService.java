package com.cunhaedu.student_database.service;

import com.cunhaedu.student_database.model.FederativeUnit;
import com.cunhaedu.student_database.repository.FederativeUnitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FederativeUnitService {
    private final FederativeUnitRepository federativeUnitRepository;

    public FederativeUnitService(FederativeUnitRepository federativeUnitRepository) {
        this.federativeUnitRepository = federativeUnitRepository;
    }

    public List<FederativeUnit> list() {
        return this.federativeUnitRepository.list();
    }
}
