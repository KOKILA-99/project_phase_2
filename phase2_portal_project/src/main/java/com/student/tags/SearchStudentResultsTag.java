package com.student.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.student.model.Student;
import com.student.model.Subject;

public class SearchStudentResultsTag extends SimpleTagSupport {
	
	private List<Student> studentsList;
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	@Override
	public void doTag() throws IOException {
		String headers[]= {"STUDENT ID","STUDENT NAME"};
		JspWriter out=getJspContext().getOut();
		
		out.print("<table border='1px'>");
		out.print("<tr>");
		for(String header:headers) {
			out.print("<th>"+header+"</th>");
		}
		out.print("</tr>");
		for(Student student:studentsList) {
			out.print("<tr>");
			out.print("<td>"+student.getStudent_Id()+"</td>");
			out.print("<td>"+student.getStudent_Name()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
	}
	
}
