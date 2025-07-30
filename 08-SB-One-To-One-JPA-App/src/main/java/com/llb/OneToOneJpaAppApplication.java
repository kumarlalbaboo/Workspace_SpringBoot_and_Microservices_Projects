package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.llb.services.PersonPassportService;

@SpringBootApplication
public class OneToOneJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneJpaAppApplication.class, args);
		
		PersonPassportService bean = context.getBean(PersonPassportService.class);
		
		//bean.savePersonWithPassport();
		bean.getPerson();
		
	}

}
