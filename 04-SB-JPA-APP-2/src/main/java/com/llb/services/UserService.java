package com.llb.services;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.llb.entity.User;
import com.llb.repos.UserRepo;

@Service
public class UserService {
	
	private static final int pageSize=5;
	
	private UserRepo userRepo;

	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	public void getUsersByGenderAndAge() {
		List<User> all = userRepo.getUsersByGenderAndAge();
		all.forEach(System.out::println);
	}
	
	public void getAllUsersByGenderAndAge(){
		List<User> all = userRepo.findByGenderAndAgeGreaterThan("Male", 25);
		all.forEach(System.out::println);
	}
	
	public void getUsersByQBE() {
		
		User user = new User();
		user.setGender("Male");
		user.setCountry("India");
		user.setAge(28);
		
		Example<User> example = Example.of(user);
		
		List<User> all = userRepo.findAll(example);
		all.forEach(System.out::println);
	}
	
	public void getUsersWithSorting() {
		
		Sort sort = Sort.by("age").ascending();
		
		List<User> all = userRepo.findAll(sort);
		
		all.forEach(System.out::println);
	}
	
	public void getUsersByPageNum(int pageNum) {
		
		// Represent pagination
		PageRequest page = PageRequest.of(pageNum-1, pageSize);
		
		Page<User> pageData = userRepo.findAll(page);
		
		//List<User> content = pageData.getContent();
		Stream<User> stream = pageData.get();
		
		stream.forEach(System.out::println);
	}
	
	

}
