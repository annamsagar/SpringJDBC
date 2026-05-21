package com.livein.JDBCEx.repository;

import com.livein.JDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void save(Student s1) {
       String sql="insert into student (rollno,name,marks) values (?,?,?)";

       int rows=jdbc.update(sql,s1.getRollno(),s1.getName(),s1.getMarks());
        System.out.println(rows+" effected");
    }
    public List<Student> findAll() {
        String sql="select * from student";

//        RowMapper<Student> rowMapper = (ResultSet rs, int rowNum) -> {
//            Student s = new Student();
//            s.setRollno(rs.getInt("rollno"));
//            s.setName(rs.getString("name"));
//            s.setMarks(rs.getInt("marks"));
//            return s;
//        }
//    };



        return jdbc.query(sql,( rs, rowNum) -> {
            Student s = new Student();
            s.setRollno(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }



}
