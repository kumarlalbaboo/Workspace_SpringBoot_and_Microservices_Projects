package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.llb.entity.User;
import com.llb.repo.UserRepository;
import com.llb.services.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		UserService bean = context.getBean(UserService.class);
		
		bean.deleteUsersByHQL();
		//bean.getAllUsersWithHQL();
		//bean.getAllUsersWithSQL();
		//bean.getUsersbyAge();
		//bean.findByGenderAndCountry();
		//bean.getUsersByCountry();
		//bean.getUsersByGender();
		//bean.delete();
		//bean.demo();
		//bean.getAll();
		//bean.getMultipleUser();
		//bean.getUserById();
		//bean.saveUsers();
		//bean.saveUser();
		
		context.close();
	}

}
