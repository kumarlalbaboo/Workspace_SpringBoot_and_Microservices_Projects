package com.llb.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llb.entities.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Serializable>{

}
