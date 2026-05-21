package com.livein.JDBCEx.service;

import com.livein.JDBCEx.model.Student;
import com.livein.JDBCEx.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    StudentRepo StudentRepo;

    public StudentRepo getStudentRepo() {
        return StudentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        StudentRepo = studentRepo;
    }

    public StudentService(StudentRepo StudentRepo) {}

    public void addstudent(Student s1) {
        StudentRepo.save(s1);
    }
}
