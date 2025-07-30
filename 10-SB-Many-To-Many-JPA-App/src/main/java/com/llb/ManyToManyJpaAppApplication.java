package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.llb.services.UserRoleService;

@SpringBootApplication
public class ManyToManyJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ManyToManyJpaAppApplication.class, args);
		
		UserRoleService bean = context.getBean(UserRoleService.class);

		//bean.saveUserWithRoles();

		//bean.getUser(1);

		bean.getRole(1);
	}

}
