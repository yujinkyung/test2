package com.gg.careerInfo;

import org.mybatis.spring.SqlSessionTemplate;

public interface CareerDAO {
	public abstract void insertCareer(CareerDTO dto, SqlSessionTemplate session);
}
