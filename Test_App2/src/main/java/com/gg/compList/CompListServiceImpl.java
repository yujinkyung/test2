package com.gg.compList;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompListServiceImpl implements CompListService{
    @Autowired
	CompListDAO dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<CompListDTO> compList() {
		System.out.println("===========================");
		System.out.println("  Comp List ServiceImpl..");
		System.out.println("===========================");
		return dao.compList(session);
	}
}
