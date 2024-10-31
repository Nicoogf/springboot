package com.crud.Crud_artifact.repository;

import com.crud.Crud_artifact.model.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final BookMapper mapper = new BookMapper();

    public BookRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<Book> getAllBooks() {
        String sql = "SELECT * FROM books";  // Asegúrate de que la tabla existe
        return jdbcTemplate.query(sql, mapper);
    }

    private static class BookMapper implements RowMapper<Book> {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String name = rs.getString("name"); // Asegúrate de que esta columna existe
            return new Book(id, name);
        }
    }
}