package model;

public class Student {
private int age;
private String grade;
private double gpa;

public Student() {
	
}

public Student(int age) {
	this.age = age;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

}
