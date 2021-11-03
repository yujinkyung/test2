package com.gg.compUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CompController {
	@Autowired
	CompService service;

	@PostMapping("/success-join-comp")
	public void InsertCompUser(@RequestBody CompDTO dto){

		System.out.println("***Comp Controller..***");
		System.out.println("   comp.name     : " + dto.COMPANY);
		System.out.println("   comp.category : " + dto.CATEGORY_ID);
		System.out.println("   comp.size     : " + dto.SIZE_ID);

		service.insertComp(dto);
	}
}
