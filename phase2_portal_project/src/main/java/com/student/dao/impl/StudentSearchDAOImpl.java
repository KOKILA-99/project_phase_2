package com.student.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.dao.StudentSearchDAO;
import com.student.dbutil.MySqlConnection;
import com.student.exception.BusinessException;
import com.student.model.Student;
import com.student.model.Subject;

public class StudentSearchDAOImpl implements StudentSearchDAO {


	@Override
	public List<Student> getReportByClass(int class_name) throws BusinessException {
		List<Student> studentsList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select distinct(student.student_id),student.student_name,student.class from "
					+ "student,class_table where student.class=class_table.class and student.class=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, class_name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Student student = new Student(resultSet.getInt("student_id"),resultSet.getString("student_name"),class_name);
				studentsList.add(student);
			}
			
			if(studentsList.size()==0) {
				throw new BusinessException("No class found as "+class_name);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured");

		}
		return studentsList;
	}

	@Override
	public List<Subject> getReportSubjectByClass(int class_name) throws BusinessException {
		List<Subject> detailsList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select  class_table.subject_id, class_table.subject_name, teacher.teacher_name from class_table,teacher where teacher.teacher_id=class_table.teacher_id  and class_table.class=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, class_name);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Subject subject = new Subject(class_name,resultSet.getString("subject_id"),resultSet.getString("subject_name"),resultSet.getString("teacher_name"));
				detailsList.add(subject);
			}
			
			if(detailsList.size()==0) {
				throw new BusinessException("No class found as "+class_name);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured");

		}
		return detailsList;
	}

}
