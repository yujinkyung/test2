package com.gg.careerInfo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CareerDAOImpl implements CareerDAO {

	@Override
	public void insertCareer(CareerDTO dto, SqlSessionTemplate session) {
		session.insert("UserMapper.insertCareer", dto);
	}

}
