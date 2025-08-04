package com.llb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
