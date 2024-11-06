package com.pk.rest;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerwithQueryParam {
	
	@GetMapping("/detail")
	public ResponseEntity<String> getdetail( @RequestParam("sname")  String sname,  @RequestParam("tname")String tname ,  @RequestParam("fee")Integer fee){
		
		String responseBody= sname + " your trainer is " + tname +" and your fee is " + fee;
		
		return new ResponseEntity<String>(responseBody, HttpStatus.OK);
		
	}

}
