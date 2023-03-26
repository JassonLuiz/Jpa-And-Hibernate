package io.github.jassonluiz.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = "INSERT INTO COURSE(ID,NAME,AUTHOR) VALUES (1, 'Learn Java Jdbc', 'Fuctura')";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
