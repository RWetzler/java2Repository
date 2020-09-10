package model;

public class StudentLogic {

	public static void calculateGrade(Student student) {
		int age = student.getAge();
		if(age <= 12 & age < 14) {
			student.setGrade("Junior High");
		}
		if(age >= 14) {
			student.setGrade("High School");
		}
		else if( age <= 10) {
			student.setGrade("Elementary");
		}
	}
	public static boolean calculateAPClass(Student student) {
		double gpa = student.getGpa();
		if(gpa >= 3.5) {
			return true;
		}
		else {
			return false;
		}
	}
}
