package com.llb.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Serializable>{

}
