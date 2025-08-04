package com.llb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entity.User;
import com.llb.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUserDetails(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsersDetails() {
		return userRepository.findAll();
	}
	
	@Override
	public User getUserById(Integer id) {
		
		return userRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("User not found"));
	}

	@Override
	public User updateUserDetails(User user, Integer id) {
		
		User existing = getUserById(id);
		
		existing.setName(user.getName());
		existing.setAge(user.getAge());
		
		return userRepository.save(existing);
	}

	@Override
	public void deleteUser(Integer id) {
		
		userRepository.deleteById(id);
	}

}
