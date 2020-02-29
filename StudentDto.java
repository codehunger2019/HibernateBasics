package com.test.basic;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class StudentDto implements Serializable {
	@Id
	private int rollno;
	private String name;
	private String stream;
	public int getRollno() {
		return rollno;
	
	}
	@Override
	public String toString() {
		return "StudentDto [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StudentDto(int rollno, String name, String stream) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.stream = stream;
	}
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	

}
