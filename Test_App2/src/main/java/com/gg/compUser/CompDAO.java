package com.gg.compUser;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface CompDAO {
	public abstract List<CompDTO> compList(SqlSessionTemplate session);
}
