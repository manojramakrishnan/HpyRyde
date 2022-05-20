package com.hpyryde.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hpyryde.main.entity.Location;
import com.hpyryde.main.service.LocationService;


@RestController
public class HpyRydeLocationUploadController {
	@Autowired
	private LocationService locationService;
	@RequestMapping(value="/carlocations",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void upload(@RequestBody List<Location> cars){
		locationService.upload(cars);
		
	}
	

} 
