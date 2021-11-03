package com.gg.compList;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompListDAOImpl implements CompListDAO{
    @Override
	public List<CompListDTO> compList(SqlSessionTemplate session) {
		return session.selectList("UserMapper.compList");
	}
}
