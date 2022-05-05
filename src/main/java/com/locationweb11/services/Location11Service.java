package com.locationweb11.services;

import java.util.List;

import com.locationweb11.entities.Location;

public interface Location11Service {
public void saveLocation(Location location);



public List<Location> getAllLocations();



public void deleteLocationById(long id);



public Location getLocationById(long id);


}
