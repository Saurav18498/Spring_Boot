package com.example.Test1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class testing {

	@Id
	@Column(name="ID")
	public int id;
	
	@Column(name="NAME")
	public String name;
	
	
	public testing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public testing(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
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
	
	@Override
	public String toString() {
		return "testing [id=" + id + ", name=" + name + "]";
	}
	
}
