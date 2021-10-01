package com.gg.compUser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompController {
	@Autowired
	CompService service;
	
	@GetMapping("/list")
	public List<CompDTO> SelectAllFromComp() {
		System.out.println("-----------------------------");
		System.out.println("    Comp Controller..");
		System.out.println("-----------------------------");
		return service.compList();
	}
}
