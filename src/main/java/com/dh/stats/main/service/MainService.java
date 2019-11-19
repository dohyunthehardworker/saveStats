package com.dh.stats.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dh.stats.main.dto.TestDTO;

@Service
public interface MainService {

	List<TestDTO> getTestValue();
}
