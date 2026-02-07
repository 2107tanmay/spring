package com.controller;

import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.JwtTokenUtil;
import com.model.Student;
import com.model.UserRequest;

@RestController
@CrossOrigin
public class AuthController 
{
	
   @GetMapping(value = "/student/getStudent", produces = "application/json")
   public Student getStudentDetails() {
     Student stu=new Student();
     stu.setStudId(101);
     stu.setStudName("John");
     return stu;
 }
   
   @PostMapping("/authenticate")
   public ResponseEntity<?> createAuthenticationToken(@RequestBody UserRequest authenticationRequest)throws Exception{
	   
	   try {
		   authenticationManager.authenticate(
				   new UsernamePasswordAuthenticationToken(
						   authenticationRequest.getUsername(),
						   authenticationRequest.getPassword()
						   )
				   );
	   }
	   catch(Exception e) {
		   throw new Exception("INVALID_CREDENTIALS",e);
	   }
	   
	   UserDetails userdetails = UserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
	   
	   String token = jwtTokenUtil.generateToken(userDetails);
	   
   }
   
	@RequestMapping("/login")
	public String login() {
		return "Successfully logged in!!";
	}
}
