package com.gg.compUser;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompServiceImpl implements CompService {
	@Autowired
	CompDAO dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<CompDTO> compList() {
		System.out.println("===========================");
		System.out.println("    Comp ServiceImpl..");
		System.out.println("===========================");
		return dao.compList(session);
	}

}
