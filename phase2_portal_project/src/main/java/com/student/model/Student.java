package com.student.model;

public class Student {
	private int student_Id;
	private String student_Name;
	private int class_Name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int student_Id, String student_Name, int class_Name) {
		super();
		this.student_Id = student_Id;
		this.student_Name = student_Name;
		this.class_Name = class_Name;
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getClass_Name() {
		return class_Name;
	}

	public void setClass_Name(int class_Name) {
		this.class_Name = class_Name;
	}


	
}
