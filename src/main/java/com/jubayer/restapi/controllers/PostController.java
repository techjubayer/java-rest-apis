package com.jubayer.restapi.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jubayer.restapi.Repo.UserRepo;

import models.User;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {
	
	@Autowired
	UserRepo userRepo;

	@ApiIgnore
	@RequestMapping(value = "/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	
	@GetMapping("/users")
	public List<User> getUser(){
		return userRepo.findAll();
		
	}
}
