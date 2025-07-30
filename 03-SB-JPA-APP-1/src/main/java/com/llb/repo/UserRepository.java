package com.llb.repo;

import java.io.Serializable;
import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.llb.entity.User;

import jakarta.persistence.criteria.From;
import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{

	//Custom query by SQL
	@Query(value="select * from user", nativeQuery = true)
	public List<User> getAllUsersBySQL();
	
	//Custom query by HQL
	@Query(value = "From User")
	public List<User> getAllUsersByHQL();
	
	//Custom query for DML operation
	@Query(value = "Delete from User where uid = :id")
	@Transactional
	@Modifying
	public void deleteUserByHQL(Integer id);
	
	//select * from user where gender='Male';  //Internally created by JPA
	public List<User> findByGender(String gender);
	
	//select * from user where country='India';
	public List<User> findByCountry(String country);
	
	//select * from user where gender='Male' and country='India';
	public List<User> findByGenderAndCountry(String gender, String country);
	
	//select * from user where age >=20;
	 public List<User> findByAgeGreaterThanEqual(Integer age);
		
}
