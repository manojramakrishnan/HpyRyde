package com.hpyryde.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpyryde.main.entity.Location;
import com.hpyryde.main.repository.LocationRepository;
import com.hpyryde.main.service.LocationService;
@Service
public class LocationServiceImpl implements LocationService{
@Autowired
private LocationRepository locationRepository;


@Override
public void upload(List<Location> cars) {
	// TODO Auto-generated method stub
	
		this.locationRepository.save(cars);
	
}


@Override
public void purge() {
	// TODO Auto-generated method stub
	this.locationRepository.deleteAll();
}

}


