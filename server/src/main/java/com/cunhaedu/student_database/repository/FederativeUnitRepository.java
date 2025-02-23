package com.cunhaedu.student_database.repository;

import com.cunhaedu.student_database.domain.FederativeUnit;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FederativeUnitRepository {
    private final JdbcTemplate template;

    FederativeUnitRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<FederativeUnit> list() {
        String sql = "select * from federative_unit";

        return template.query(sql, (resultSet, rowNumber) -> {
            var federativeUnit = new FederativeUnit();
            federativeUnit.setId(resultSet.getInt("id"));
            federativeUnit.setName(resultSet.getString("name"));
            federativeUnit.setAcronym(resultSet.getString("acronym"));

            return federativeUnit;
        });
    }
}
