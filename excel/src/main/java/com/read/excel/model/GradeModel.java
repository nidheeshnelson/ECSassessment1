package com.read.excel.model;

public class GradeModel {
private double mark;
private String grade;
private String gradepoint;
public double getMark() {
	return mark;
}
public void setMark(double mark) {
	this.mark = mark;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getGradepoint() {
	return gradepoint;
}
public void setGradepoint(String gradepoint) {
	this.gradepoint = gradepoint;
}
@Override
public String toString() {
	return "GradeModel [mark=" + mark + ", grade=" + grade + ", gradepoint=" + gradepoint + "]";
}

}
