package com.student.dao;

import java.util.List;

import com.student.exception.BusinessException;
import com.student.model.Student;
import com.student.model.Subject;

public interface StudentSearchDAO {
	public List<Student> getReportByClass(int class_name) throws BusinessException;
	public List<Subject> getReportSubjectByClass(int class_name) throws BusinessException;
}
