package com.gg.academicCareerInfo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AcademicDAOImpl implements AcademicDAO {

	@Override
	public void insertAcademic(AcademicDTO dto, SqlSessionTemplate session) {
		session.insert("UserMapper.insertAcademic", dto);
	}

}
