package com.gg.careerInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CareerController {
	@Autowired
	CareerService service;
	
	@PostMapping("/success-join-ci")
	public void InsertCareerInfo(@RequestBody CareerDTO dto) {
		System.out.println("***Career Controller..***");
		System.out.println("   career.id      : " + dto.P_ID);
		System.out.println("   career.company : " + dto.P_COMPANY);
		System.out.println("   career.dept    : " + dto.P_DEPARTMENT);
		System.out.println("   career.duty    : " + dto.P_DUTY);
		
		service.insertCareer(dto);
	}
}