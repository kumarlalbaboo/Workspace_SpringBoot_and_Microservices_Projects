package com.llb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.llb.entity.Student;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Long>{

}
