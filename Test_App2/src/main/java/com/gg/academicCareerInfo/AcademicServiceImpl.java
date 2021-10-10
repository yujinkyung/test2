package com.gg.academicCareerInfo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicServiceImpl implements AcademicService {
	@Autowired
	AcademicDAO dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public void insertAcademic(AcademicDTO dto) {
		System.out.println("===========================");
		System.out.println("Academic Career ServiceImpl..");
		System.out.println("===========================");
		dao.insertAcademic(dto, session);
	}

}
