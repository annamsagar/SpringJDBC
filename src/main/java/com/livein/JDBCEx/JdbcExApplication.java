package com.livein.JDBCEx;

import com.livein.JDBCEx.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcExApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(JdbcExApplication.class, args);
		Student s1=(Student)context.getBean("student");
		s1.setRollno(101);
		s1.setName("Sagar");
		s1.setMarks(85);
		System.out.println(s1.toString());
	}
}
