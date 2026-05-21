package com.livein.JDBCEx.repository;

import com.livein.JDBCEx.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    public static List<Student> findAll() {
        List<Student> student= new ArrayList<>();
        return student;
    }

    public void save(Student s1) {
        System.out.println("saved student");
    }

}
