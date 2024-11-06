package com.pk.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerwithPathParam {
	
	@GetMapping("/course/{sname}/{tname}/{fee}")
	public ResponseEntity<String> getdetail( @PathVariable("sname")  String sname,  @PathVariable("tname")String tname ,  @PathVariable("fee")Integer fee){
		
		String responseBody= sname + " your trainer is " + tname +" and your fee is " + fee;
		
		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
		
	}

}
