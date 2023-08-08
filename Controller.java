package com.stg.controller;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stg.entity.RegisteredUser;
import com.stg.exception.BookStoreException;
import com.stg.service.RegisterUserService;

@RestController
@RequestMapping(value = "registry")
@CrossOrigin(origins = "*")
public class RegistryController {
	@Autowired
	private RegisterUserService registryService;
	
	@PostMapping(value="register/{name}/{userName}/{password}/{phoneNumber}")
	public ResponseEntity< String> registerUser(@PathVariable String name,@PathVariable String userName,@PathVariable String password,@PathVariable  long phoneNumber)throws BookStoreException {
		
		return new ResponseEntity<String>( registryService.registerUser(name, userName, password, phoneNumber),HttpStatus.OK);
	}
	
	
	
	

}
