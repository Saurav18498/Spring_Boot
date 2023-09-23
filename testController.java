package com.example.Test1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class testController {
	
	@Autowired
	private EntityManager en;
	
	@Autowired
	TestingService service;
	
	@GetMapping(value = "/test/{sks}")
	public List<testing> test(@RequestParam("id") String id, @PathVariable String sks)  {
		System.out.println(service.testing());
		return service.testing();
		
	}
	
	@PostMapping(value = "/test/put")
	public void createuser(@RequestBody testing t) {
		service.create(t);
	}

	@GetMapping(value = "/test")
	public List<testing> test()  {
		Session currentsession = en.unwrap(Session.class);
		Query<testing> qr = currentsession.createQuery("from testing",testing.class);
		
		System.out.println(qr);
		List<testing> res=qr.list();
		//System.out.println(res.toString());
		return res;
		
	}
}
