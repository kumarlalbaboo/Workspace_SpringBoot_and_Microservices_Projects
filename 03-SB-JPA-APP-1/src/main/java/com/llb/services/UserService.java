package com.llb.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entity.User;
import com.llb.repo.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	@Autowired  //@Autowired is optional because parameterized constructor is single parameter 
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void deleteUsersByHQL() {
		userRepository.deleteUserByHQL(3);
	}
	
	public void getAllUsersWithHQL() {
		List<User> allUsersByHQL = userRepository.getAllUsersByHQL();
		allUsersByHQL.forEach(System.out::println);
	}
	
	public void getAllUsersWithSQL() {
		List<User> allUsersBySQL = userRepository.getAllUsersBySQL();
		allUsersBySQL.forEach(System.out::println);
	}
	
	public void getUsersbyAge() {
		List<User> ByGender = userRepository.findByAgeGreaterThanEqual(20);
		ByGender.forEach(System.out::println);	
	}
	
	public void findByGenderAndCountry() {
		List<User> byGenderAndCountry = userRepository.findByGenderAndCountry("Male", "India");
		byGenderAndCountry.forEach(System.out::println);
	}
	
	
	public void getUsersByCountry() {
		List<User> byCountry = userRepository.findByCountry("India");
		byCountry.forEach(System.out::println);
	}
	
	public void getUsersByGender() {
		List<User> byGender = userRepository.findByGender("Male");
		byGender.forEach(System.out::println);
		//System.out.println(byGender);
	}
	
	public void delete() {
		userRepository.deleteById(1);
	}
	
	public void demo() {
		boolean existsById = userRepository.existsById(1);
		if (existsById) {
			System.out.println("Record is found");
		} else {
			System.out.println("Record not found");
		}
	}
	
	public void getAll() {
		Iterable<User> all = userRepository.findAll();
		all.forEach(System.out::println);
	}
	
	public void getMultipleUser() {
		Iterable<User> allById = userRepository.findAllById(Arrays.asList(1,2));
		allById.forEach(System.out::println);
	}
	
	public void getUserById() {
		Optional<User> byId = userRepository.findById(1);
		
		if(byId.isPresent()) {
			User user = byId.get();
			System.out.println(user);
		} else {
			System.out.println("No record found");
		}
	}
	
	public void saveUsers() {
		User entity = new User();
		entity.setUname("Rani");
		entity.setAge(34);
		entity.setGender("Female");
		entity.setPhno(887766292);
		entity.setCountry("US");
		
		User entity1 = new User();
		entity1.setUname("Abhimanyu");
		entity1.setAge(28);
		entity1.setGender("Male");
		entity1.setPhno(754966292);
		entity1.setCountry("India");

		User entity2 = new User();
		entity2.setUname("Lalbaboo");
		entity2.setAge(28);
		entity2.setGender("Male");
		entity2.setPhno(925566292);
		entity2.setCountry("UK");


		
		userRepository.saveAll(Arrays.asList(entity,entity1,entity2));
		
		System.out.println("Data saved successfully..");
	}
	
	public void saveUser() {
		User entity = new User();
		entity.setUname("Pritam");
		entity.setAge(14);
		entity.setGender("Male");
		entity.setPhno(87466292);
		entity.setCountry("India");
		
		userRepository.save(entity);
		
		System.out.println("Data saved successfully..");
	}
	
}
