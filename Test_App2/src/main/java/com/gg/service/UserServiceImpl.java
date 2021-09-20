package com.gg.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.dao.UserDAO;
import com.gg.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<UserDTO> userList() {
		System.out.println("===========================");
		System.out.println("hello! ServiceImpl..");
		System.out.println("===========================");
		return dao.userList(session);
	}
}
