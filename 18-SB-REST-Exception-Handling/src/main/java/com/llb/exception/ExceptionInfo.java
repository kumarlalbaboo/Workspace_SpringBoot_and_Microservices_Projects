package com.llb.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionInfo {
	
	private String exCode;
	
	private String exMsg;
	
	private LocalDateTime exDateTime;

}
