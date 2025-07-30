package com.llb.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entities.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Serializable>{

}
