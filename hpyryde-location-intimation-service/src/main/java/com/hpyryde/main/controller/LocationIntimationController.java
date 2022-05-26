package com.hpyryde.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hpyryde.main.service.LocationIntimationService;

@RestController
public class LocationIntimationController {

	@Autowired
	private LocationIntimationService locationIntimationService;
	
}
