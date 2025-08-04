package com.llb.service;

import java.util.List;

import com.llb.entity.User;

public interface UserService {

	User addUserDetails(User user);

	List<User> getUsersDetails();
	
	User getUserById(Integer id);

	User updateUserDetails(User user, Integer id);

	void deleteUser(Integer id);

}
