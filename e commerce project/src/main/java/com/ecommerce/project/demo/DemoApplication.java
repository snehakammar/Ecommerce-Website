package com.ecommerce.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		TreeSet<Integer> items = new TreeSet<>();


		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);

		Collections.max(items);

		System.out.println(items);



		System.out.println(items);
	}





}
