package com.vj.beans;

public class Course {

	private int courseId;
	private String courseName;
	private float courseFee;
	
	public Course(int courseId, String courseName, float courseFee) {
		System.out.println("Course :: 3 -param");
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}
//toString
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
}
