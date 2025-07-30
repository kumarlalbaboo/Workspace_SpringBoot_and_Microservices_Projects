package com.llb.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.entities.Address;
import com.llb.entities.Employee;
import com.llb.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void saveEmployeeWithAddress() {
		Address a1 = new Address();
		a1.setCity("New Delhi");
		a1.setState("Delhi");
		a1.setCountry("IND");
		a1.setType("Current");
		
		Address a2 = new Address();
		a2.setCity("Begusarai");
		a2.setState("Bihar");
		a2.setCountry("IND");
		a2.setType("Permanent");
		
		Employee emp = new Employee();
		emp.setName("Lalbaboo");
		emp.setSalary(25000.00);
		
		//Associating emp obj with Address objs
		a1.setEmployee(emp);
		a2.setEmployee(emp);
		
		//Associating address objs with emp obj
		emp.setAddressList(Arrays.asList(a1,a2));
		//emp.setAddressList(List.of(a1,a2));
		
		// Save parent record
		employeeRepo.save(emp);
		
		System.out.println("Employee saved...");
	}
	
	public void getEmp() {
		employeeRepo.findById(1);
	}

}
