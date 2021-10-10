package com.gg.academicCareerInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademicController {
	@Autowired
	AcademicService service;
	
	@PostMapping("/success-join-aci")
	public void InsertACInfo(@RequestBody AcademicDTO dto) {
		System.out.println("*Academic Career Controller..*");
		System.out.println("   aci.id     : " + dto.P_ID);
		System.out.println("   aci.degree : " + dto.DEGREE);
		System.out.println("   aci.school : " + dto.SCHOOL_NAME);
		System.out.println("   aci.major  : " + dto.MAJOR);
		
		service.insertAcademic(dto);
	}
}
