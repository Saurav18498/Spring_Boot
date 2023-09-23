package com.example.Test1;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
		
		String arr = "Sauarv Kumar SInha";
		System.out.println(!arr.contains("Saurav"));
		int ar[] = {5,6,7,2,1
				};
		Arrays.sort(ar);
		Arrays.stream(ar)
		.forEach(System.out::println);
		String sp[] =arr.split(" ");
		Arrays.stream(sp)
		.forEach(System.out::println);
		System.out.println(sp.toString());
		
		
		
		}
		

}
