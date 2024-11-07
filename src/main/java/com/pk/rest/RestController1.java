package com.pk.rest;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	
	@GetMapping("/welcome")
	public String getMsg() {
		
		String responsebody ="welcome to the first REST app";
		
		return responsebody;
	}
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreet(){
		
		String responseBody= "hello !! how  can i help you ?";
		 
		 return new ResponseEntity<String>(responseBody, HttpStatus.OK);
	}


}
