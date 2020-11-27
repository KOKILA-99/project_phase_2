package com.subject.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.student.model.Student;
import com.student.model.Subject;

public class SearchSubjectResultstag extends SimpleTagSupport {
	
	private List<Subject> detailsList;
	public void setDetailsList(List<Subject> detailsList) {
		this.detailsList = detailsList;
	}






	@Override
	public void doTag() throws IOException {
		String headers[]= {"SUBJECT ID","SUBJECT NAME","TEACHER NAME"};
		JspWriter out=getJspContext().getOut();
		
		out.print("<table border='1px'>");
		out.print("<tr>");
		for(String header:headers) {
			out.print("<th>"+header+"</th>");
		}
		out.print("</tr>");
		for(Subject subject:detailsList) {
			out.print("<tr>");
			out.print("<td>"+subject.getSubject_Id()+"</td>");
			out.print("<td>"+subject.getSubject_Name()+"</td>");
			out.print("<td>"+subject.getTeacher_Name()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
	}
	
}