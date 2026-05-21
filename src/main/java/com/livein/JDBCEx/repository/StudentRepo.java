package com.livein.JDBCEx.repository;

import com.livein.JDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
    public static List<Student> findAll() {
        List<Student> student= new ArrayList<>();
        return student;
    }



}
