package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

public class gradeTest {
	Student student = new Student();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testStudentAgeELM() {
		student.setAge(10);
		StudentLogic.calculateGrade(student);
		assertEquals("Elementary", student.getGrade());
		System.out.println("Inside testStudentAgeELM");
	}
	@Test
	public void testStudentAgeJR() {
		student.setAge(12);
		StudentLogic.calculateGrade(student);
		assertEquals("Junior High", student.getGrade());
		System.out.println("Inside testStudentAgeJR");
	}
	@Test
	public void testStudentAgeHS() {
		student.setAge(14);
		StudentLogic.calculateGrade(student);
		assertEquals("High School", student.getGrade());
		System.out.println("Inside testStudentAgeHS");
	}

}
