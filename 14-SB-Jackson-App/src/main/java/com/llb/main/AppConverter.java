package com.llb.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.llb.dto.Customer;

public class AppConverter {
	public static void main(String[] args) throws Exception {
		
		AppConverter ac = new AppConverter();
		
		//ac.convertToJson();
		
		ac.convertFromJson();
		
	}	
	
	public void convertToJson() throws Exception{
		File file = new File("customer.json");
		
		Customer c = new Customer();
		
		c.setId(101);
		c.setName("Abhimanyu");
		c.setEmail("llbkmr41@gmail.com");
		c.setPhno(7549662926l);
		
		// Serialization
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, c);
		System.out.println("Serialization completed...");
		
	}
	
	public void convertFromJson() throws Exception {
		File file = new File("customer.json");
		
		// De-Serialization
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(file, Customer.class);
		
		System.out.println(c);
		
		System.out.println("De-Serialization completed...");
	}

}
