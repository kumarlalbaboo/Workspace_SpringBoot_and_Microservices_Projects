package com.llb.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entities.Passport;
import com.llb.entities.Person;
import com.llb.repo.PassportRepo;
import com.llb.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	public void savePersonWithPassport() {
		Passport p = new Passport();
		p.setPassportNum("H38KS9N2");
		p.setIssuedDt(LocalDate.now());
		p.setExpDt(LocalDate.now().plusYears(10));
		
		Person pp = new Person();
		pp.setName("Lalbaboo Kumar");
		pp.setGender("M");
		
		//Associating entities
		p.setPerson(pp);
		pp.setPassport(p);
		
		//Save the person
		personRepo.save(pp);
		System.out.println("Record saved...");
	}
	
	public void getPerson() {
		Optional<Person> byId = personRepo.findById(1);
		
		if(byId.isPresent()) {
			Person person = byId.get();
			System.out.println("Name : "+person.getName());
		}
	}
}
