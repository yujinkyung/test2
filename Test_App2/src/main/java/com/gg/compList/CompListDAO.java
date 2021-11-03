package com.gg.compList;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface CompListDAO {
    public abstract List<CompListDTO> compList(SqlSessionTemplate session);
}
