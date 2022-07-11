package Eleven;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	public String studentName;
	public int rollno;
	String dob;
	String className;
	String section;
	
	Result rs;
	public Student(String studentName, int rollno, String dob, String className, String section, Result rs) {
		super();
		this.studentName = studentName;
		this.rollno = rollno;
		this.dob = dob;
		this.className = className;
		this.section = section;
		this.rs = rs;
	}
	
	
	

}
