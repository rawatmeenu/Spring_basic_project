package com.hib.projectwithmaven;

import javax.persistence.Embeddable;

//used Student and certificate class to embed one class into another and Embdemo.java for main file.

@Embeddable
public class Certificate {
	
	private String duration;
	private String course;
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Certificate(String duration, String course) {
		super();
		this.duration = duration;
		this.course = course;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certificate [duration=" + duration + ", course=" + course + "]";
	}
	
	
	

}
