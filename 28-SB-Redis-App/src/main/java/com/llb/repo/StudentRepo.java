package com.llb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.llb.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
