package com.example.model;

public class Student {

	private long id;
	private String fName;
	private String lName;
	private String gender;
	private int age;
	
	public Student(long id, String fName, String lName, String gender, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", age=" + age + "]";
	}
	
}