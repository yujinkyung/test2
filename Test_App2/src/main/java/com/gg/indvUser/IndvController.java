package com.gg.indvUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndvController {
	@Autowired
	IndvService service;
	
	@PostMapping("/success-join")
	public void InsertIndvUser(@RequestBody IndvDTO dto) {
		System.out.println("-----------------------------");
		System.out.println("      Indv Controller..");
		System.out.println("   dto.name   : " + dto.getNAME());
		System.out.println("   dto.id     : " + dto.getP_ID());
		System.out.println("   dto.email  : " + dto.getP_EMAIL());
		System.out.println("   dto.contact: " + dto.getPHONE());
		System.out.println("   dto.BOD    : " + dto.getBIRTH_DATE());
		System.out.println("-----------------------------");
		
		service.insertIndv(dto);
	}
}
