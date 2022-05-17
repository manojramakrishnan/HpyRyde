package com.hpyryde.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hpyryde.main.repository.LocationRepository;
import com.hpyryde.main.service.LocationService;
@Service
public class LocationServiceImpl implements LocationService{
@Autowired
private LocationRepository locationRepository;
}
