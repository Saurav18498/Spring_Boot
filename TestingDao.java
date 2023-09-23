package com.example.Test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingDao{

	@Autowired
	testingrepo repo;
	
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(repo.finditnew());
//	}
	public List<testing> dao(){
	
		return repo.finditnew();
	}
	public void created(testing t) {
		repo.save(t);
	}
}
