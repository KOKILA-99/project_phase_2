package com.student.model;

public class Subject {
   
  private int class_name;
  private String subject_Id;
  private String subject_Name;
  private String teacher_Name;
  


  public Subject() {
	  
  }


public Subject(int class_name,String subject_Id, String subject_Name, String teacher_Name) {
	super();
	this.class_name=class_name;
	this.subject_Id = subject_Id;
	this.subject_Name = subject_Name;
	this.teacher_Name = teacher_Name;
}


public String getSubject_Id() {
	return subject_Id;
}


public int getClass_name() {
	return class_name;
}


public void setClass_name(int class_name) {
	this.class_name = class_name;
}


public void setSubject_Id(String subject_Id) {
	this.subject_Id = subject_Id;
}


public String getSubject_Name() {
	return subject_Name;
}


public void setSubject_Name(String subject_Name) {
	this.subject_Name = subject_Name;
}


public String getTeacher_Name() {
	return teacher_Name;
}


public void setTeacher_Name(String teacher_Name) {
	this.teacher_Name = teacher_Name;
}

}
