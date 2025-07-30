package com.llb.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Serializable>{

}
