package com.llb.repos;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.llb.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Serializable>{
	
	@Query(value = "select * from user where gender='Male' and age >= 25", nativeQuery = true)
	public List<User> getUsersByGenderAndAge();
	
	public List<User> findByGenderAndAgeGreaterThan(String gender, Integer age);

	
	@Query(value = "select uid, name from user", nativeQuery = true)
	public List<Object[]> getRecords(); //when we select specific column 
										//then return type should be List<Object[]>
	
}
