package com.student.service.impl;
import java.util.List;

import com.student.dao.StudentSearchDAO;
import com.student.dao.impl.StudentSearchDAOImpl;
import com.student.exception.BusinessException;
import com.student.model.Student;
import com.student.model.Subject;
import com.student.service.StudentSearchService;

public class StudentSearchServiceImpl implements StudentSearchService {
	private StudentSearchDAO dao=new StudentSearchDAOImpl();
	
	@Override
	public List<Student> getReportByClass(int class_name) throws BusinessException {
		List<Student> studentsList=null;
		if(class_name>0) {
			//DAO
			studentsList=dao.getReportByClass(class_name);
		}else {
			throw new BusinessException("Entered class "+class_name +" is invalid");
		}
		return studentsList;
	}

	@Override
	public List<Subject> getReportSubjectByClass(int class_name) throws BusinessException {
		List<Subject> detailsList=null;
		detailsList=dao.getReportSubjectByClass(class_name);
		return detailsList;
	}
}