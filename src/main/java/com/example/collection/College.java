package com.example.collection;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class College {

	private int id;
	private String name;
	private Map<Integer, Students> std;
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
	public Map<Integer, Students> getStd() {
		return std;
	}
	public void setStd(Map<Integer, Students> std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
}
