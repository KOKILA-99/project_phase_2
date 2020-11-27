package com.student.service;
import java.util.List;

import com.student.exception.BusinessException;
import com.student.model.Student;
import com.student.model.Subject;
public interface StudentSearchService {
	public List<Student> getReportByClass(int class_value) throws BusinessException;
	public List<Subject> getReportSubjectByClass(int class_name) throws BusinessException;

}
