package com.locationweb11.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationweb11.entities.Location;
import com.locationweb11.repositeries.Location11Repository;

@Service
public class Location11ServiceImpl implements Location11Service {

	@Autowired
	private Location11Repository locationRepo;

	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}

	@Override
	public List<Location> getAllLocations() {
		List<Location> list11 = locationRepo.findAll();
		return list11;
	}

	@Override
	public void deleteLocationById(long id) {
		locationRepo.deleteById(id);
	}

	@Override
	public Location getLocationById(long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location=findById.get();
		return location;
	}

}
