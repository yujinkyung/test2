package com.gg.academicCareerInfo;

import org.mybatis.spring.SqlSessionTemplate;

public interface AcademicDAO {
	public abstract void insertAcademic(AcademicDTO dto, SqlSessionTemplate session);
}
