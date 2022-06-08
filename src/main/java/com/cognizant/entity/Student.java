package com.cognizant.entity;

public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lNameString=" + lNameString + "]";
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String fName, String lNameString) {
		super();
		this.id = id;
		this.fName = fName;
		this.lNameString = lNameString;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlNameString() {
		return lNameString;
	}
	public void setlNameString(String lNameString) {
		this.lNameString = lNameString;
	}
	
	private int id;
	private String fName;
	private String lNameString;

}
