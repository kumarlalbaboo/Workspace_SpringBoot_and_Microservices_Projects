package com.llb.exception;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(exception = UserNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleUserNotFoundEx(UserNotFoundException e){
		
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExCode("EX000001");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(exception = SQLException.class)
	public ResponseEntity<ExceptionInfo> handleSQLEx(SQLException e){
		
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExCode("EX000003");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(exception = Exception.class)
	public ResponseEntity<ExceptionInfo> handleEx(Exception e){
		
		ExceptionInfo exInfo = new ExceptionInfo();
		
		exInfo.setExCode("EX000002");
		exInfo.setExMsg(e.getMessage());
		exInfo.setExDateTime(LocalDateTime.now());
		
		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
