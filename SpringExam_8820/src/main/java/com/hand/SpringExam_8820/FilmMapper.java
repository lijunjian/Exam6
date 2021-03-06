package com.hand.SpringExam_8820;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FilmMapper implements RowMapper<Film> {
	public Film mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Film film = new Film();
	      film.setId(rs.getInt("id"));
	      film.setTitle(rs.getString("title"));
	      film.setDescription(rs.getString("description"));
	      film.setLanguage_id(rs.getInt("language_id"));
	      return film;
	}

}
