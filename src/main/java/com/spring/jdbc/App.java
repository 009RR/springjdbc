package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My Program started.....");
		/* spring jdbc-->jdbcTemplate */

		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
				
				
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		
		/*
		 * Student student = studentDao.getStudent(222); System.out.println(student);
		 * 
		 */

		// delete operation
		/*
		 * int result= studentDao.delete(666); System.out.println("deleted:"+result);
		 */

		/*
		 * //update operation Student student= new Student(); student.setId(456);
		 * student.setName("Manish"); student.setCity("Delhi");
		 * 
		 * int result=studentDao.change(student);
		 * System.out.println("data changed "+result);
		 */

		//insert data
		/*
		 * Student student=new Student(); student.setId(612); student.setName("Shyam");
		 * student.setCity("Pune"); int result=studentDao.insert(student);
		 * System.out.println("student added"+result); // JdbcTemplate
		 */		 
		 List<Student> students = studentDao.getAllStudents();
			for (Student s : students) {
				System.out.println(s);
			}

		 
		 
		 /* template=context.getBean("jdbcTemplate", JdbcTemplate.class);
		 */
		// insert query
		// String query="insert into student(id,name,city) values(?,?,?)";

		// fire query
		/*
		 * int result = template.update(query,457,"Raj Kumar","Kanpur");
		 * System.out.println("Number of record inserted.."+result);
		 */
	}
}
