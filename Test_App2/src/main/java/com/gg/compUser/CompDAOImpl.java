package com.gg.compUser;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CompDAOImpl implements CompDAO {

	@Override
	public List<CompDTO> compList(SqlSessionTemplate session) {
		return session.selectList("UserMapper.compList");
	}

}
