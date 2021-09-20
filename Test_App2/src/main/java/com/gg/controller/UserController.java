package com.gg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.dto.UserDTO;
import com.gg.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/list")
	public List<UserDTO> SelectAllFromUser() {
		System.out.println("-----------------------------");
		System.out.println("hello! Controller..");
		System.out.println("-----------------------------");
		return service.userList();
	}
}