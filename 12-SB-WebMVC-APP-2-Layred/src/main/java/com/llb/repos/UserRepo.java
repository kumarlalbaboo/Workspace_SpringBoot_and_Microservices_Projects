package com.llb.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
