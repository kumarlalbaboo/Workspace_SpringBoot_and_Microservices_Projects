package com.llb.generator;

import java.beans.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmpIdGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		// Logic to generate PK column value
		String prefix = "OD";
		String suffix = "";
		
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return prefix+suffix;
	}
	
	

}
