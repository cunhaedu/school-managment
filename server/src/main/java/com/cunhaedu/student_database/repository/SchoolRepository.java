package com.cunhaedu.student_database.repository;

import com.cunhaedu.student_database.model.FederativeUnit;
import com.cunhaedu.student_database.model.School;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolRepository {
    private final JdbcTemplate template;

    SchoolRepository(JdbcTemplate template) {
        this.template = template;
    }

    public List<School> list() {
        String sql = """
            select school.id id,
                   school.name name,
                   school.about about,
                   school.image_url image_url,
                   school.active active,
                   federative_unit.id federative_unit_id,
                   federative_unit.acronym federative_unit_acronym
            from school
            join federative_unit on federative_unit.id = school.uf_id
            """;

        return template.query(sql, (resultSet, rowNumber) -> {
            var school = new School();
            school.setId(resultSet.getInt("id"));
            school.setName(resultSet.getString("name"));
            school.setAbout(resultSet.getString("about"));
            school.setActive(resultSet.getBoolean("active"));
            school.setImageLink(resultSet.getString("image_url"));

            var federativeUnit = new FederativeUnit();
            federativeUnit.setId(resultSet.getInt("federative_unit_id"));
            federativeUnit.setAcronym(resultSet.getString("federative_unit_acronym"));
            school.setFederativeUnit(federativeUnit);

            return school;
        });
    }

    public int create(School school) {
        String sql = "insert into school (name, about, image_url, address, uf_id, city, email, cell_phone) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";

        return template.update(
                sql,
                school.getName(),
                school.getAbout(),
                school.getImageLink(),
                school.getAddress(),
                school.getFederativeUnit().getId(),
                school.getCity(),
                school.getEmail(),
                school.getCellphone()
        );
    }

    public void update(int id, School school) {
        String sql = """
            UPDATE school
            SET name = ?,
                about = ?,
                image_url = ?,
                address = ?,
                uf_id = ?,
                city = ?,
                email = ?,
                cell_phone = ?
            WHERE id = ?;
            """;

        template.update(
                sql,
                school.getName(),
                school.getAbout(),
                school.getImageLink(),
                school.getAddress(),
                school.getFederativeUnit().getId(),
                school.getCity(),
                school.getEmail(),
                school.getCellphone(),
                id
        );
    }
}
