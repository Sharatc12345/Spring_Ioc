package com.example.ref;

public class College {
	private int id;
	private String name;
	private Student std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + "]";
	}
	

}
