package com.cunhaedu.student_database.repository;

import com.cunhaedu.student_database.domain.user.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {
    private final JdbcTemplate template;

    UserRepository(JdbcTemplate template) {
        this.template = template;
    }

    public Optional<User> findByEmail(String email) {
        String sql = "select * from users where email = ?";

        try {
            var foundUser = template.queryForObject(sql, (resultSet, rowNumber) -> {
                var user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));

                return user;
            }, email);

            return Optional.ofNullable(foundUser);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}
