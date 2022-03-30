package com.springbatchexample.component;

import com.springbatchexample.entity.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class StudentResultRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student student = new Student();
        student.setId(rs.getLong("id"));
        student.setRollNumber(rs.getString("roll_number"));
        student.setName(rs.getString("name"));
        return student;
    }
}
