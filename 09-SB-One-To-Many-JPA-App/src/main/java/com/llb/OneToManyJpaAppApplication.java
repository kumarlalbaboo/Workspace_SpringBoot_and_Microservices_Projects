package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.llb.services.EmployeeService;

@SpringBootApplication
public class OneToManyJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToManyJpaAppApplication.class, args);
		
		EmployeeService bean = context.getBean(EmployeeService.class);
		
		//bean.saveEmployeeWithAddress();
		bean.getEmp();
	}

}
