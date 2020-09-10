package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import model.Student;
import model.StudentLogic;

public class gpaTest {
	
	Student student = new Student();
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testAPClassTrue() {
		student.setGpa(3.5);
		assertTrue(StudentLogic.calculateAPClass(student));
		System.out.println("Inside APClassTrue");
	}
	@Test
	public void testAPClassFalse() {
		student.setGpa(2.3);
		assertFalse(StudentLogic.calculateAPClass(student));
		System.out.println("Inside APClassFalse");
	}

}
