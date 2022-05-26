package com.hpyryde.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpyryde.main.repository.LocationIntimationRepository;

@Service
public class LocationIntimationServiceImpl {

	@Autowired
	private LocationIntimationRepository locationIntimationRepository;
	
}
