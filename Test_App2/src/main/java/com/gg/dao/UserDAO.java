package com.gg.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.gg.dto.UserDTO;

public interface UserDAO {
	public abstract List<UserDTO> userList(SqlSessionTemplate session);
}
