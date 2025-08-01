package com.llb.repos;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>{

}
