package com.CapG.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CapG.Model.User;
import com.CapG.Service.UserService;

@RestController
public class UserRestController
{
	@Autowired
	UserService Service;
	
	@PostMapping("/Reg")
	public ResponseEntity<User> createProduct(@Validated @RequestBody User Reg)
	{
		System.out.println("Rest");
		User e= Service.addUser(Reg);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<User>(e,HttpStatus.OK);
	}
	
	
	@GetMapping("/login")
	public ResponseEntity createUser(@Validated @RequestBody User user)
	{
	User us=Service.login(user.getUsername(), user.getPassword());
	
	if(Objects.nonNull(us))
	{
		return ResponseEntity.ok().body("Login successfully");
	}
	else
	{
		return ResponseEntity.ok().body("Incorrect username or password");
		
	}
	
	}
	@PutMapping ("/Reg/{userId}")
	  public ResponseEntity<User> updateUser(@PathVariable int userId,@RequestBody User user) {
	  
	  User e = Service.updateUser(user); 
	  return new ResponseEntity<User>(e,HttpStatus.OK); }	
}
	
		

		
		
	
	

	
