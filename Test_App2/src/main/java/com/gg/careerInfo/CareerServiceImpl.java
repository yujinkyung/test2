package com.gg.careerInfo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerServiceImpl implements CareerService {
	@Autowired
	CareerDAO dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public void insertCareer(CareerDTO dto) {
		System.out.println("===========================");
		System.out.println("   Career ServiceImpl..");
		System.out.println("===========================");
		dao.insertCareer(dto, session);
	}

}