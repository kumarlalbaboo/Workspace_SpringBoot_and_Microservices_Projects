package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.llb.services.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserService bean = context.getBean(UserService.class);
		
		bean.getUsersByGenderAndAge();
		//bean.getAllUsersByGenderAndAge();
		//bean.getUsersByQBE();
		//bean.getUsersWithSorting();
		//bean.getUsersByPageNum(1);
	
	}

}
