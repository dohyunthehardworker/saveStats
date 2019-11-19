package com.dh.stats.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.stats.main.dto.TestDTO;
import com.dh.stats.main.mapper.MainMapper;
import com.dh.stats.main.service.MainService;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainMapper mainMapper;

	@Override
	public List<TestDTO> getTestValue() {
		return mainMapper.getTestValue();
	}

}
