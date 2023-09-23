package com.example.Test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestingService {

	@Autowired
	TestingDao todo;
	
	public List<testing> testing() {
		//Business Logic
		
		return todo.dao();
	}
	
	public void create(testing t) {
		todo.created(t);
	}
}
