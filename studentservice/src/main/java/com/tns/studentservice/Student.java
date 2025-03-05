package com.tns.studentservice;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	private Integer id;
	private String name;
	private String college;
	private String qualification;
	private String course;
	private int year; 
	private long certificate;
	
	
	public Student() {
		super();
		
	}

	public Student(Integer id, String name, String college, long roll, String qualification, String course,
			int year, long certificate, long hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
	
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}


	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getCertificate() {
		return certificate;
	}

	public void setCertificate(long certificate) {
		this.certificate = certificate;
	}


	@Override
	public String toString() {
		return "StudentService [id=" + id + ", name=" + name + ", college=" + college + ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", certificate="
				+ certificate + ",getId()=" + getId() + ", getName()=" + getName()
				+ ", getCollege()=" + getCollege() + ",  getQualification()="
				+ getQualification() + ", getCourse()=" + getCourse() + ", getYear()=" + getYear()
				+ ", getCertificate()=" + getCertificate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}


