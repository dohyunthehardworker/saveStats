package com.dh.stats.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dh.stats.main.dto.TestDTO;

@Mapper
public interface MainMapper {
	
	List<TestDTO> getTestValue();

}
