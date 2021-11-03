package com.gg.compUser;

import org.mybatis.spring.SqlSessionTemplate;

public interface CompDAO {
	public abstract void insertComp(CompDTO dto, SqlSessionTemplate session);
}
